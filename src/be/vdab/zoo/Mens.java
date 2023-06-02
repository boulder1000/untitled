package be.vdab.zoo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Objects;

public class Mens extends Zoogdier implements Comparator<Mens>{
    private long rijksregisternummer;
    private LocalDate geboortedatum;

    public Mens(String naam, long rijksregisternummer, LocalDate geboortedatum) {
        super(naam);
        try {


            if (new RijksregisternummerValidator().isValid(rijksregisternummer, geboortedatum)) {
                this.rijksregisternummer = rijksregisternummer;
            }
        }
        catch (Exception ex) {
        System.err.println(ex);
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
    public int compare(Mens o1, Mens o2) {
        return -1;
    }

    @Override
    public String toString() {
        return "Mens{" +
                "geboortedatum=" + geboortedatum.format(DateTimeFormatter.ofPattern("yyyy")) +
                "} " + super.toString();
    }
}
