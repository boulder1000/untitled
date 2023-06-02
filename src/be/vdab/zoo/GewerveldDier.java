package be.vdab.zoo;

import java.util.List;
import java.util.Objects;

public abstract class GewerveldDier {
    private Huidbedekking huidbedekking;

    private List<be.vdab.zoo.Milieu> milieu;
    private String naam;

    public GewerveldDier(be.vdab.zoo.Huidbedekking huidbedekking, List<be.vdab.zoo.Milieu> milieu, String naam) {
        huidbedekking = huidbedekking;
        milieu = milieu;
        naam = naam;

    }

    public GewerveldDier() {
    }

    public Huidbedekking getHuidbedekking() {
        return huidbedekking;
    }

    public List<Milieu> getMilieu() {
        return milieu;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GewerveldDier that)) return false;
        return huidbedekking == that.huidbedekking && Objects.equals(milieu, that.milieu) && Objects.equals(naam, that.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(huidbedekking, milieu, naam);
    }

    @Override
    public String toString() {
        return "GewerveldDier{" +
                "Huidbedekking=" + huidbedekking +
                ", Milieu=" + milieu +
                ", Naam='" + naam + verzorging()+'\'' +
                '}';
    }

    public String verzorging(){
        return switch (this.huidbedekking) {
            case glad -> "regelmatig laten afkoelen";
            case schubben -> "geen speciale verzorging nodig";
            case haren -> "regelmatig wassen";
            case veren -> "regelmatig wassen en invetten";
            default -> null;
        };
    }
}


