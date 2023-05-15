package be.vdab.collections;

import java.util.Objects;

public class tienkamper implements Comparable<tienkamper>
{
    private String naam;
    private int punten;

    public tienkamper(String naam, int punten) {
        this.naam = naam;
        this.punten = punten;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        this.punten = punten;
    }

    @Override
    public String toString() {
        return "tienkamper{" +
                "naam='" + naam + '\'' +
                ", punten=" + punten +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof tienkamper that)) return false;
        return getPunten() == that.getPunten() && Objects.equals(getNaam(), that.getNaam());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNaam(), getPunten());
    }

    @Override
    public int compareTo(tienkamper o) {
        return this.naam.compareTo(o.naam);
    }

}
