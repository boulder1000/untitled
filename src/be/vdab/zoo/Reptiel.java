package be.vdab.zoo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract non-sealed class Reptiel extends GewerveldDier{


    public Reptiel(String naam) {
        super(Huidbedekking.schubben, Arrays.asList(Milieu.land,Milieu.water), naam);
    }
}
