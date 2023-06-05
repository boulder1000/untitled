package be.vdab.zoo;

import java.util.*;

public record Zoo( Set<GewerveldDier> set){


    public void voegDierToe(GewerveldDier gewerveldDier) {
        set.add(gewerveldDier);
    }

    public void  printLijst(Set<GewerveldDier>list){
        list.stream().forEach(GewerveldDier -> System.out.println(GewerveldDier));

    }

    public Set printlijstVanAlleDieren(Set<GewerveldDier>list) {
        list.stream().filter(GewerveldDier -> GewerveldDier.getMilieu().contains(Milieu.land)).forEach(GewerveldDier -> System.out.println(GewerveldDier.getNaam()));
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
