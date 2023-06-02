package be.vdab.zoo;

import java.time.LocalDate;
import java.util.List;

public class ZooApp {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.VoegDierToe(new Struisvogel("bob",Vliegen.vliegen));
        zoo.VoegDierToe(new Beer("ujhj", List.of(new String("berg"),new String("land"))));
        zoo.VoegDierToe(new kikker("gb"));
        zoo.VoegDierToe(new Krokodil("hjn,",5,12));
        zoo.VoegDierToe(new Mens("rik",88101322344L,LocalDate.of(1988,10,13)));
        zoo.VoegDierToe(new Zalm("kkkl",WelkeVis.zout,"rood"));

        //foute dieren

        zoo.VoegDierToe(new Struisvogel("bob",Vliegen.vliegen));
        zoo.VoegDierToe(new Beer("ghf", List.of(new String("land"),new String("land"))));
        zoo.VoegDierToe(new Krokodil("fhd,",-5,12));
        zoo.VoegDierToe(new Mens("sfg",8810122345L,LocalDate.of(1988,10,13)));

        zoo.printLijst();

        zoo.printlijstVanAlleDieren();
        zoo.lijstVanAlleDierenNamenGesorteerdOpAlfabet();
        zoo.percentageMensen();


    }
}
