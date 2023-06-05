package be.vdab.zoo;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ZooApp {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(new HashSet<>());
        try {

            zoo.voegDierToe(new Struisvogel("struis", Vliegen.vliegen));
            zoo.voegDierToe(new Beer("beer", List.of("berg", "land")));
            zoo.voegDierToe(new Kikker("kikker"));
            zoo.voegDierToe(new Krokodil("kroko,", 5, 12));
            zoo.voegDierToe(new Mens("mens", 88101322344L, LocalDate.of(1988, 10, 13)));
            zoo.voegDierToe(new Zalm("zalm", WelkeVis.zout, "rood"));

            //foute dieren

            //zoo.voegDierToe(new Struisvogel("struis", Vliegen.vliegen));
            // zoo.voegDierToe(new Beer("beer1", List.of("land", "land")));
            //zoo.voegDierToe(new Krokodil("kroko1,", -5, 12));
            //zoo.voegDierToe(new Mens("mens1", 8810122345L, LocalDate.of(1988, 10, 13)));

            zoo.printLijst(zoo.set());

            zoo.printlijstVanAlleDieren(zoo.set());
          Set<String> setLijstAlpha = zoo.lijstVanAlleDierenNamenGesorteerdOpAlfabet(zoo.set());
            zoo.percentageMensen();
        }
        catch (IllegalArgumentException  | RijksregisternummerNietGeldigException ex ){
            System.err.println(ex);
        }
}}
