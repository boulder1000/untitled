package be.vdab.voorwerpen;

import be.vdab.voorwerpen.utils.Voorwerp;

public class boekenrek implements Voorwerp {
    private int hoogte;
    private int breedte;
    private float aankoopprijs;
    private final float winstmarge = 2.00F;

    public boekenrek() {
        this(20,50,100F);
    }

    public boekenrek(int hoogte, int breedte, float aankoopprijs) {
        if (hoogte >= 0){
        this.hoogte = hoogte;}
        if (breedte >= 0){
        this.breedte = breedte;}
        if (aankoopprijs >= 0){
        this.aankoopprijs = aankoopprijs;}
        if (aankoopprijs >= 0) {
        }
    }

    public String getEigenaar() {
        return eigenaar;
    }

    public int getHoogte() {
        return hoogte;
    }

    public int getBreedte() {
        return breedte;
    }

    public float getAankoopprijs() {
        return aankoopprijs;
    }

    public float getWinstmarge() {
        return winstmarge;
    }

    @Override
    public String toString() {
        return "boekenrek{" +
                "eigenaar='" + eigenaar + '\'' +
                ", hoogte=" + hoogte +
                ", breedte=" + breedte +
                ", aankoopprijs=" + aankoopprijs +
                ", winstmarge=" + winstmarge +
                '}';
    }

    @Override
    public void gegevenstonen() {
        System.out.println("eigenaar "+eigenaar+"hoogte "+hoogte+"breedte "+"aankoopprijs "+aankoopprijs+"winstmarge "+winstmarge+"winst "+Winstberekenen());
    }

    @Override
    public float Winstberekenen() {
        return aankoopprijs*winstmarge;
    }
}
