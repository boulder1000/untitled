package be.vdab.voorwerpen;

public class leesboek extends boek{
    private String onderwerp;
    private final float winstmarge = 1.5F;

    public leesboek() {
        this("hgf","dd",5.5F,"yyy","onder","978-0-306-40615-7");
    }

    public leesboek(String titel, String auteur, float aankoopprijs, String genre, String onderwerp,String isbn13) {
        super(titel, auteur, aankoopprijs, genre,isbn13);
        this.onderwerp = onderwerp;
    }

    public String getOnderwerp() {
        return onderwerp;
    }

    public void setOnderwerp(String onderwerp) {
        this.onderwerp = onderwerp;
    }

    public float getWinstmarge() {
        return winstmarge;
    }

    @Override
    public String toString() {
        return "leesboek{" +
                "onderwerp='" + onderwerp + '\'' +
                ", winstmarge=" + winstmarge +
                "} " + super.toString();
    }

    @Override
    public void gegevenstonen() {
        System.out.println("titel "+getTitel()+"auteur "+getAuteur()+"eigenaar "+getEigenaar()+"aankoopprijs "+getAankoopprijs()+"genre "+getGenre()+"onderwerp "+getOnderwerp()+"winstmarge "+winstmarge+"winst "+Winstberekenen());
    }

    @Override
    public float Winstberekenen() {
        return getAankoopprijs()*winstmarge;
    }
}
