package be.vdab.voertuigen;

import be.vdab.voertuigen.div.Nummerplaat;

import java.io.Serializable;
import java.util.Objects;

public class Personenwagen extends Voertuig {
    private int zitplaatsen = 1;

    public Personenwagen(String merk, int aankoopprijs, int zitplaatsen) {
        super(merk, aankoopprijs);
        setZitplaatsen(zitplaatsen);
    }

    public int getZitplaatsen() {
        return zitplaatsen;
    }

    public void setZitplaatsen(int zitplaatsen) {
        if (zitplaatsen >0){
            this.zitplaatsen = zitplaatsen;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personenwagen that)) return false;
        if (!super.equals(o)) return false;
        return getZitplaatsen() == that.getZitplaatsen();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getZitplaatsen());
    }


    @Override
    public String toString() {
        return "Personenwagen{" +
                "zitplaatsen=" + zitplaatsen +
                "} " + super.toString();
    }
}
