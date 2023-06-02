package be.vdab.zoo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Reptiel extends GewerveldDier{
    private static final List<Milieu> list = Arrays.asList(new Milieu[]{Milieu.land,Milieu.water});

    public Reptiel(String naam) {
        super(Huidbedekking.schubben, list, naam);
    }
}
