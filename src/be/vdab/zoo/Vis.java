package be.vdab.zoo;


import java.util.Arrays;
import java.util.List;

public abstract class Vis extends GewerveldDier{
    private WelkeVis welkeVis;
    private static final List<Milieu> list = Arrays.asList(new Milieu[]{Milieu.water});

    public Vis(String naam, WelkeVis welkeVis) {
        super(Huidbedekking.glad, list, naam);
        this.welkeVis = welkeVis;
    }

    @Override
    public String toString() {
        return "Vis{" +
                "welkeVis=" + welkeVis +
                "} " + super.toString();
    }
}

