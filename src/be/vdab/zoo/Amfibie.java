package be.vdab.zoo;


import java.util.Arrays;
import java.util.List;

public  abstract non-sealed class Amfibie extends GewerveldDier{

    public Amfibie(String naam) {
        super(Huidbedekking.glad, Arrays.asList(Milieu.land,Milieu.water), naam);
    }
}
