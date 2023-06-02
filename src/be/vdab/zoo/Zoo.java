package be.vdab.zoo;

import java.util.*;

public record Zoo() {
    private static Set<GewerveldDier> set = new HashSet<>();

    public void VoegDierToe(GewerveldDier gewerveldDier) {
        set.add(gewerveldDier);
    }

    public void  printLijst() {
        set.stream().forEach(GewerveldDier -> System.out.println(GewerveldDier));

    }

    public void printlijstVanAlleDieren() {
        set.stream().filter(GewerveldDier -> GewerveldDier.getMilieu().contains(Milieu.land)).forEach(GewerveldDier -> System.out.println(GewerveldDier.getNaam()));
    }
    public void lijstVanAlleDierenNamenGesorteerdOpAlfabet()
    {
  set.stream().sorted(Comparator.comparing(GewerveldDier::getNaam)).forEach(gewerveldDier -> System.out.println(gewerveldDier.getNaam()));
    }


    public void percentageMensen(){
        long mensen = set.stream().filter(GewerveldDier -> GewerveldDier instanceof Mens).count();
    }
public void lijstVanAlleKrokodillenGesorteerdOpGewicht(){

}
}
