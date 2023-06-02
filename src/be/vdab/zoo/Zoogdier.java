package be.vdab.zoo;


import java.util.Arrays;
import java.util.List;

public abstract non-sealed class Zoogdier extends GewerveldDier{

    public Zoogdier(String naam) {
        super(Huidbedekking.haren, Arrays.asList(Milieu.land,Milieu.water), naam);
    }
}
