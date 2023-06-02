package be.vdab.zoo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Objects;

public class Mens extends Zoogdier implements Comparable<Mens>{
    private long rijksregisternummer;
    private LocalDate geboortedatum;

    public Mens(String naam, long rijksregisternummer, LocalDate geboortedatum) {
        super(naam);
            if (new RijksregisternummerValidator().isValid(rijksregisternummer, geboortedatum)) {
                this.rijksregisternummer = rijksregisternummer;
            }
        this.geboortedatum = geboortedatum;
        }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mens mens)) return false;
        if (!super.equals(o)) return false;
        return rijksregisternummer == mens.rijksregisternummer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rijksregisternummer);
    }

    @Override
    public String toString() {
        var nu = LocalDate.now();
        var period = Period.between(geboortedatum,nu);
        return "Mens{" +
                "geboortedatum=" + period.getYears() +
                "} " + super.toString();
    }

    @Override
    public int compareTo(Mens o) {
        return 0;
    }
}
