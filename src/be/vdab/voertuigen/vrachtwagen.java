package be.vdab.voertuigen;

public class vrachtwagen extends voertuig implements Vervuiler{
    private float maxlading = 10000F;

    public vrachtwagen(String polishouder, float kostprijs, int pk, float gemverbruik, String nummerplaat, float maxlading) {
        super(polishouder, kostprijs, pk, gemverbruik, nummerplaat);
        this.maxlading = maxlading;
    }

    @Override
    public String toString() {
        return super.toString()+
         "vrachtwagen{" +
                "maxlading=" + maxlading +
                '}';
    }

    public double getKyotoScore(){
        return getGemverbruik() * getPk() / maxlading;
    }

    public String toon(){
        return super.toon() +

         "maxlading" + maxlading;
    }

    @Override
    public double berekenVervuiling() {
        return getKyotoScore() * 20;
    }

    @Override
    public void geefMilieuData() {
        System.out.println(getPk() +" " + getKostprijs()+" "+ getGemverbruik());
    }

    @Override
    public void geefPrivateData() {
        System.out.println(getPolishouder()+getNummerplaat());
    }
}
