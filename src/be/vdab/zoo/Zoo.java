package be.vdab.zoo;

import java.util.*;
import java.util.stream.*;

public record Zoo( Set<GewerveldDier> set){


    public void voegDierToe(GewerveldDier gewerveldDier) {
        if (!(set().contains(gewerveldDier.getNaam())))
        set.add(gewerveldDier);
    }

    public void  printLijst(Set<GewerveldDier>list){
        list.stream().forEach(System.out::println);

    }

    public List<String> printlijstVanAlleDieren(Set<GewerveldDier>list) {
        return list.stream().filter(GewerveldDier -> GewerveldDier.getMilieu().contains(Milieu.land)).map(GewerveldDier::getNaam).collect(Collectors.toList());
    }
    public List<String> lijstVanAlleDierenNamenGesorteerdOpAlfabet(Set<GewerveldDier> set)
    {
        return set.stream().sorted(Comparator.comparing(GewerveldDier::getNaam)).map(GewerveldDier::getNaam).collect(Collectors.toList());
    }


    public OptionalDouble percentageMensen(Set<GewerveldDier> set){
   return DoubleStream.of(set.stream().filter(GewerveldDier -> GewerveldDier instanceof Mens).count(), (long) set.size()).reduce((deeltal, deler) -> deeltal/deler);

    }
public List<GewerveldDier> lijstVanAlleKrokodillenGesorteerdOpGewicht(Set<GewerveldDier> set){
    return set.stream().filter( GewerveldDier -> GewerveldDier instanceof Krokodil).collect(Collectors.toList());
}
}
