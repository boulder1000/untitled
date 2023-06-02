package be.vdab.zoo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public record Zoo() {
    private static Set<GewerveldDier> set = new HashSet<>();

    public void VoegDierToe(GewerveldDier gewerveldDier) {
        set.add(gewerveldDier);
    }

    public void  printLijst() {
        set.stream().forEach(GewerveldDier -> System.out.println(GewerveldDier));

    }

    public void printlijstVanAlleDieren() {
        set.stream().filter(GewerveldDier -> GewerveldDier.getMilieu().equals(Milieu.land)).forEach(GewerveldDier -> System.out.println(GewerveldDier));
    }
    public void lijstVanAlleDierenNamenGesorteerdOpAlfabet()
    {
  set.stream().sorted().forEach(gewerveldDier -> System.out.println(gewerveldDier.getNaam()));
    }


}
