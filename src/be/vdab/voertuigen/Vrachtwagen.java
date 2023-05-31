package be.vdab.voertuigen;

import be.vdab.voertuigen.div.Nummerplaat;
import be.vdab.voertuigen.util.Laadbaar;
import be.vdab.voertuigen.util.Volume;

import java.util.Objects;

public class Vrachtwagen extends Voertuig implements Laadbaar {
    private Volume laadvolume;
    private int maximaalToegelatenMassa,aantalAssen;

    public Vrachtwagen(String merk, int aankoopprijs, Volume laadbaar, int maximaalToegelatenMassa, int aantalAssen) {
        super(merk, aankoopprijs);
        this.laadvolume = laadbaar;
        this.maximaalToegelatenMassa = maximaalToegelatenMassa;
        this.aantalAssen = aantalAssen;
    }

    public Volume getLaadvolume() {
        return laadvolume;
    }

    public void setLaadvolume(Volume laadvolume) {
        this.laadvolume = laadvolume;
    }

    public int getMaximaalToegelatenMassa() {
        return maximaalToegelatenMassa;
    }

    public void setMaximaalToegelatenMassa(int maximaalToegelatenMassa) {
        this.maximaalToegelatenMassa = maximaalToegelatenMassa;
    }

    public int getAantalAssen() {
        return aantalAssen;
    }

    public void setAantalAssen(int aantalAssen) {
        this.aantalAssen = aantalAssen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vrachtwagen that)) return false;
        if (!super.equals(o)) return false;
        return getMaximaalToegelatenMassa() == that.getMaximaalToegelatenMassa() && getAantalAssen() == that.getAantalAssen() && Objects.equals(getLaadvolume(), that.getLaadvolume());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLaadvolume(), getMaximaalToegelatenMassa(), getAantalAssen());
    }

    @Override
    public String toString() {
        return "Vrachtwagen{" +
                "laadvolume=" + laadvolume +
                ", maximaalToegelatenMassa=" + maximaalToegelatenMassa +
                ", aantalAssen=" + aantalAssen +
                "} " + super.toString();
    }


}
