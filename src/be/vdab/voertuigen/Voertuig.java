package be.vdab.voertuigen;

import be.vdab.voertuigen.div.Div;
import be.vdab.voertuigen.div.Nummerplaat;

import java.io.Serializable;
import java.util.Objects;

public abstract class Voertuig implements Comparable<Voertuig>, Serializable {
    private final Nummerplaat nummerplaat = Div.INSTANCE.getNummerplaat();
    private String merk;
    private int aankoopprijs;

    public Voertuig(String merk, int aankoopprijs) {
        setMerk(merk);
        setAankoopprijs(aankoopprijs);
    }

    public Nummerplaat getNummerplaat() {
        return nummerplaat;
    }

    public String getMerk() {
        return merk;
    }

    public int getAankoopprijs() {
        return aankoopprijs;
    }

    public void setMerk(String merk) {
        if (merk != null){
            this.merk = merk;
        }
    }

    public void setAankoopprijs(int aankoopprijs) {
        if (aankoopprijs >= 0){
            this.aankoopprijs = aankoopprijs;
        }
    }

    @Override
    public String toString() {
        return "Voertuig{" +
                "nummerplaat=" + nummerplaat +
                ", merk='" + merk + '\'' +
                ", aankoopprijs=" + aankoopprijs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Voertuig voertuig)) return false;
        return getAankoopprijs() == voertuig.getAankoopprijs() && Objects.equals(getNummerplaat(), voertuig.getNummerplaat()) && Objects.equals(getMerk(), voertuig.getMerk());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNummerplaat(), getMerk(), getAankoopprijs());
    }

    @Override
    public int compareTo(Voertuig o) {
        return this.nummerplaat.compareTo(o.nummerplaat);

    }
}

