package be.vdab.zoo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class RjiksregisternummerValidator {
    public boolean isValid(long rijksregisternummer, LocalDate geboortedatum){
        String strDatum = geboortedatum.format(DateTimeFormatter.ofPattern("yymmdd")).toString();
        boolean x = true;
        String eerste = String.valueOf(rijksregisternummer).substring(0,5);
        if (!(strDatum.equals(eerste))){
            x = false;

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
            rest = (int) (eerste9 % 97);
        }

        var controlegetal = (int) (rijksregisternummer % 100);

        if (controlegetal != rest){
            x = false;
        }
        if (x = false){
            throw new RijksregisternummerNietGeldigException("fout nummer");
        }
        else return true;
    }
}
