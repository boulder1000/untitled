package be.vdab.zoo;


import java.util.Arrays;
import java.util.List;

public abstract class Zoogdier extends GewerveldDier{
    private static final List<Milieu> list = Arrays.asList(new Milieu[]{Milieu.land,Milieu.water});

    public Zoogdier(String naam) {
        super(Huidbedekking.haren, list, naam);
    }
}
