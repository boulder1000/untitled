package be.vdab.voertuigen;

public class personenwagen extends voertuig implements Vervuiler{
    private int aantaldeuren = 4;
    private int aantalpassagiers = 5;

    public personenwagen(String polishouder, float kostprijs, int pk, float gemverbruik, String nummerplaat, int aantaldeuren, int aantalpassagiers) {
        super(polishouder, kostprijs, pk, gemverbruik, nummerplaat);
        this.aantaldeuren = aantaldeuren;
        this.aantalpassagiers = aantalpassagiers;
    }

    @Override
    public String toString() {
        return "personenwagen{" +
                "aantaldeuren=" + aantaldeuren +
                ", aantalpassagiers=" + aantalpassagiers +
                "} " + super.toString();
    }

    public double getKyotoScore(){
        return (getGemverbruik() * getPk() / aantalpassagiers);
}
    public String toon(){
        return super.toon()+
         "aantaldeuren" + aantaldeuren + "aantalpassagiers" + aantalpassagiers;
    }

    @Override
    public double berekenVervuiling() {
        return getKyotoScore() * 5;
    }
    @Override
    public void geefMilieuData() {
        System.out.println(getPk() +" "+ getKostprijs()+ " "+getGemverbruik());
    }

    @Override
    public void geefPrivateData() {
        System.out.println(getPolishouder()+getNummerplaat());
    }
}
