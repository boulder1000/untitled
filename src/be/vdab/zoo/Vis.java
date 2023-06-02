package be.vdab.zoo;


import java.util.Arrays;
import java.util.List;

public abstract non-sealed class Vis extends GewerveldDier{
    private WelkeVis welkeVis;

    public Vis(String naam, WelkeVis welkeVis) {
        super(Huidbedekking.glad, Arrays.asList(Milieu.water), naam);
        this.welkeVis = welkeVis;
    }

    @Override
    public String toString() {
        return "Vis{" +
                "welkeVis=" + welkeVis +
                "} " + super.toString();
    }
}

