package be.vdab.voertuigen;

import be.vdab.voertuigen.div.Nummerplaat;
import be.vdab.voertuigen.util.Laadbaar;
import be.vdab.voertuigen.util.Volume;

import java.util.Objects;

public class Pickup extends Voertuig implements Laadbaar {

    private Volume laadvolume;

    public Pickup(String merk, int aankoopprijs, Volume laadvolume) {
        super(merk, aankoopprijs);
        this.laadvolume = laadvolume;
    }

    public Volume getLaadvolume() {
        return laadvolume;
    }

    public void setLaadvolume(Volume laadvolume) {
        this.laadvolume = laadvolume;
    }

    @Override
    public String toString() {
        return "Pickup{" +
                "laadvolume=" + laadvolume +
                "} " + super.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pickup pickup)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getLaadvolume(), pickup.getLaadvolume());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLaadvolume());
    }
}
