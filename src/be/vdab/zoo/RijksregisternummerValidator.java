package be.vdab.zoo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RijksregisternummerValidator {
    public static boolean isValid(long rijksregisternummer, LocalDate geboortedatum){
        String strDatum = geboortedatum.format(DateTimeFormatter.ofPattern("yyMMdd")).toString();
        boolean boolFoutloos = true;
        String eerste = String.valueOf(rijksregisternummer).substring(0,6);
        if (!(strDatum.equals(eerste))){
            boolFoutloos = false;

        }
        var eerste9 = rijksregisternummer / 100;
        String strCon =  String.valueOf(eerste9);
        var rest = 0;
        if (geboortedatum.isAfter(LocalDate.of(1999,12,31))) {
           strCon = "2" + strCon;
           int intCon = Integer.parseInt(strCon);
            rest = (int) (intCon % 97);

        }
        else {
            rest = 97- (int) (eerste9 % 97);
        }

        var controlegetal = (int) (rijksregisternummer % 100);

        if (controlegetal != rest){
            boolFoutloos = false;
        }
        if (boolFoutloos == false){
            throw new RijksregisternummerNietGeldigException("fout nummer");
        }
        else return true;
    }
}
