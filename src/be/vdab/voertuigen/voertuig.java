package be.vdab.voertuigen;

import javax.swing.*;

public abstract class voertuig implements Milieu,Privaat{
    private String polishouder;
    private float kostprijs = 0.0F;
    private int pk = 0;
    private float gemverbruik = 0.0F;
    private String nummerplaat;

    public voertuig() {
    }

    public voertuig(String polishouder, float kostprijs, int pk, float gemverbruik, String nummerplaat) {
        if (!(polishouder == null && polishouder.isEmpty())){
        this.polishouder = polishouder;}
        if (kostprijs > 0){
        this.kostprijs = kostprijs;}
        if (pk > 0){
        this.pk = pk;}
        if (gemverbruik > 0){
        this.gemverbruik = gemverbruik;}
        if (!(nummerplaat == null && nummerplaat.isEmpty())){
        this.nummerplaat = nummerplaat;}
    }

    public String getPolishouder() {
        return polishouder;
    }

    public float getKostprijs() {
        return kostprijs;
    }

    public int getPk() {
        return pk;
    }

    public float getGemverbruik() {
        return gemverbruik;
    }

    public String getNummerplaat() {
        return nummerplaat;
    }

    public abstract double getKyotoScore();
    @Override
    public String toString() {
        return "voertuig{" +
                "polishouder='" + polishouder + '\'' +
                ", kostprijs=" + kostprijs +
                ", pk=" + pk +
                ", gemverbruik=" + gemverbruik +
                ", nummerplaat='" + nummerplaat + '\'' +
                '}';
    }

    public String toon(){
        return "polishouder" + polishouder + "kostprijs" + kostprijs + "pk" + pk + "gemverbruik" + gemverbruik + "nummerplaat" + nummerplaat;
    }
}
