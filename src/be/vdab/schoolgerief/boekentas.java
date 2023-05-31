package be.vdab.schoolgerief;

import be.vdab.voertuigen.util.Laadbaar;
import be.vdab.voertuigen.util.Volume;

import java.util.Objects;

public class boekentas implements Laadbaar {
    private String kleur;
    private Volume laadvolume;

    public boekentas(String kleur, Volume laadvolume) {
        setKleur(kleur);
        setLaadvolume(laadvolume);
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        if (kleur != null && !(kleur.isBlank())){
            this.kleur = kleur;
        }
        else throw new IllegalArgumentException("geen kleur");
    }

    @Override
    public Volume getLaadvolume() {
        return laadvolume;
    }

    @Override
    public void setLaadvolume(Volume laadvolume) {
        if (laadvolume != null){
            this.laadvolume = laadvolume;
        }
        else throw new IllegalArgumentException("geen volume");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof boekentas boekentas)) return false;
        return Objects.equals(getKleur(), boekentas.getKleur()) && Objects.equals(getLaadvolume(), boekentas.getLaadvolume());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKleur(), getLaadvolume());
    }

    @Override
    public String toString() {
        return "boekentas{" +
                "kleur='" + kleur + '\'' +
                ", laadvolume=" + laadvolume +
                '}';
    }
}
