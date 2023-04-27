package be.vdab.voorwerpen;

public class woordenboek extends boek{
    private String taal;
    private final float winstmarge = 1.5F;

    public woordenboek() {
        this("kkk","uuju",20F,"ggdfd","nl","978-0-306-40615-7");
    }

    public woordenboek(String titel, String auteur, float aankoopprijs, String genre, String taal,String isbn13) {
        super(titel, auteur, aankoopprijs, genre,isbn13);
        this.taal = taal;
    }

    public String getTaal() {
        return taal;
    }

    public void setTaal(String taal) {
        this.taal = taal;
    }

    public float getWinstmarge() {
        return winstmarge;
    }

    @Override
    public String toString() {
        return "woordenboek{" +
                "taal='" + taal + '\'' +
                ", winstmarge=" + winstmarge +
                "} " + super.toString();
    }

    @Override
    public void gegevenstonen() {
        System.out.println("titel "+getTitel()+"auteur "+getAuteur()+"eigenaar "+getEigenaar()+"aankoopprijs "+getAankoopprijs()+"genre "+getGenre()+"taal "+getTaal()+"winstmarge "+getWinstmarge()+"winst "+Winstberekenen());
    }

    @Override
    public float Winstberekenen() {
        return getAankoopprijs()*winstmarge;
    }
}
