package be.vdab.zoo;

import java.util.*;
import java.util.stream.Collectors;

public record Zoo( Set<GewerveldDier> set){


    public void voegDierToe(GewerveldDier gewerveldDier) {
        set.add(gewerveldDier);
    }

    public void  printLijst(Set<GewerveldDier>list){
        list.stream().forEach(GewerveldDier -> System.out.println(GewerveldDier));

    }

    public Set<String> printlijstVanAlleDieren(Set<GewerveldDier>list) {
        return list.stream().filter(GewerveldDier -> GewerveldDier.getMilieu().contains(Milieu.land)).map(GewerveldDier  -> GewerveldDier.getNaam()).collect(Collectors.toSet());
    }
    public Set<String> lijstVanAlleDierenNamenGesorteerdOpAlfabet(Set<GewerveldDier> set)
    {
        return set.stream().sorted(Comparator.comparing(GewerveldDier::getNaam)).map(GewerveldDier  -> GewerveldDier.getNaam()).collect(Collectors.toSet());
    }


    public void percentageMensen(){
        long mensen = set.stream().filter(GewerveldDier -> GewerveldDier instanceof Mens).count();
    }
public void lijstVanAlleKrokodillenGesorteerdOpGewicht(){

}
}
