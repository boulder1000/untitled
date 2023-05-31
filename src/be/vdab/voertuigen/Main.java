package be.vdab.voertuigen;

import be.vdab.Directories.Gastenboek;
import be.vdab.schoolgerief.boekentas;
import be.vdab.voertuigen.util.Laadbaar;
import be.vdab.voertuigen.util.Maat;
import be.vdab.voertuigen.util.Volume;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        var ts = new TreeSet<Voertuig>();
        var ts2 = new TreeSet<Voertuig>();
        ts.add(new Personenwagen("tool",50,4));
        ts.add(new Personenwagen("rggf",70,5));
        ts.add(new Pickup("dool",60,new Volume(50,60,80, Maat.CENTIMETER)));
        ts.add(new Pickup("joof",90,new Volume(20,30,90, Maat.DECIMETER)));
        ts.add(new Vrachtwagen("lppl",600,new Volume(500,900,700,Maat.METER),8,6));
        ts.add(new Vrachtwagen("khhg",900,new Volume(200,400,600,Maat.DECIMETER),9,12));

        for (var I : ts){
            System.out.println(I);
        }
        Path x = Path.of("/data/wagenpark.dat");
        try (var stream = new ObjectOutputStream(Files.newOutputStream(x)))
        {
            for (var I : ts){
                stream.writeObject(I);
            }

        }
        catch (IOException ex)
        {
            System.out.println(ex);
        }
        try (var stream = (new ObjectInputStream(Files.newInputStream(x)) ))
        {
            while (true) {
                var voertuig = (Voertuig) stream.readObject();
                ts2.add(voertuig);
            }
        }
        catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);

        }

        for (var I : ts2){
            System.out.println(I);
        }

        var boekentas1 = new boekentas("geel",new Volume(40,50,60,Maat.CENTIMETER));
        var boekentas2 = new boekentas("blauw",new Volume(30,80,90,Maat.DECIMETER));
        var arry = new ArrayList<Laadbaar>();
        arry.add(boekentas1);
        arry.add(boekentas2);
        arry.add(new Vrachtwagen("khhg",900,new Volume(200,400,600,Maat.DECIMETER),9,12));

double volume = 0;
        for (var laad :arry)
        {
            System.out.println(laad);
            volume += laad.getLaadvolume().getVolume();
        }
        System.out.println(volume);


    }
}

