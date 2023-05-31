package be.vdab.voertuigen.div;

import java.util.Objects ;

public  class Nummerplaat implements Comparable{
    public final String plaat;

    public Nummerplaat(String plaat) {
        this.plaat = plaat;
    }

    public String getPlaat() {
        return plaat;
    }

    @Override
    public String toString() {
        return "Nummerplaat{" +
                "plaat='" + plaat + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nummerplaat that)) return false;
        return Objects.equals(getPlaat(), that.getPlaat());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlaat());
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
