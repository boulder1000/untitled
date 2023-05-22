package be.vdab.multithreading;

import be.vdab.Directories.GastenboekEntry;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var getallen = new double[1000000];
        var random = new Random();
        for (var i = 0; i < getallen.length; i++) {
            getallen[i] = random.nextInt();
        }
        var Rekenaar1 =
                new rekenaar(getallen, 0, getallen.length / 2);
        var Rekenaar2 =
                new rekenaar(getallen,getallen.length/2,getallen.length);
        var thread1 = new Thread(Rekenaar1);
        var thread2 = new Thread(Rekenaar2);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }
        System.out.println((Rekenaar1.getGemiddelde() +
                Rekenaar2.getGemiddelde()) / 2);
    }
}


