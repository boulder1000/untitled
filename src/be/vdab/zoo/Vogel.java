package be.vdab.zoo;


import java.util.Arrays;
import java.util.List;

public abstract non-sealed class Vogel extends GewerveldDier{
    private Vliegen vliegen;

    public Vogel(String naam, Vliegen vliegen) {
        super(Huidbedekking.veren, Arrays.asList(Milieu.lucht,Milieu.land), naam);
        this.vliegen = vliegen;
    }

    @Override
    public String toString() {
        return "vogel{" +
                "vliegen=" + vliegen +
                "} " + super.toString();
    }
}

