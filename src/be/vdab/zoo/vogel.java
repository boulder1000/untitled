package be.vdab.zoo;


import java.util.Arrays;
import java.util.List;

public abstract class vogel extends GewerveldDier{
    private Vliegen vliegen;
    private static final List<Milieu> list = Arrays.asList(new Milieu[]{Milieu.lucht,Milieu.land});

    public vogel(String naam, Vliegen vliegen) {
        super(Huidbedekking.veren, list, naam);
        this.vliegen = vliegen;
    }

    @Override
    public String toString() {
        return "vogel{" +
                "vliegen=" + vliegen +
                "} " + super.toString();
    }
}

