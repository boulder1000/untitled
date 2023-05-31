package be.vdab.voertuigen;

import be.vdab.voertuigen.util.Maat;
import be.vdab.voertuigen.util.Volume;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        var ts = new TreeSet<Voertuig>();
        ts.add(new Personenwagen("tool",50,4));
        ts.add(new Personenwagen("rggf",70,5));
        ts.add(new Pickup("dool",60,new Volume(50,60,80, Maat.CENTIMETER)));
        ts.add(new Pickup("joof",90,new Volume(20,30,90, Maat.DECIMETER)));
        ts.add(new Vrachtwagen("lppl",600,new Volume(500,900,700,Maat.METER),8,6));
        ts.add(new Vrachtwagen("khhg",900,new Volume(200,400,600,Maat.DECIMETER),9,12));

        for (var I : ts){
            System.out.println(I);
        }
    }
}
