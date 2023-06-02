package be.vdab.zoo;


import java.util.Arrays;
import java.util.List;

public abstract class Amfibie extends GewerveldDier{
    private static final List<Milieu> list = Arrays.asList(new Milieu[]{Milieu.land,Milieu.water});

    public Amfibie(String naam) {
        super(Huidbedekking.glad, list, naam);
    }
}
