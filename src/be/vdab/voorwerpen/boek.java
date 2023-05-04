package be.vdab.voorwerpen;

import be.vdab.voorwerpen.utils.Voorwerp;

public abstract class boek implements Voorwerp {
    private String titel;
    private String auteur;
    private float aankoopprijs;
    private String genre;
    private String isbn13;

    public boek() {
    }

    public boek(String titel, String auteur, float aankoopprijs, String genre,String isbn13) {
        if (!(titel == null) || titel.isEmpty()){
        this.titel = titel;}
        if (!(auteur == null) || auteur.isEmpty()){
        this.auteur = auteur;}
        if (aankoopprijs >= 0){
        this.aankoopprijs = aankoopprijs;}
        if (!(genre == null) || genre.isEmpty()){
        this.genre = genre;}
        setIsbn13(isbn13);
    }

    public String getTitel() {
        return titel;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getEigenaar() {
        return eigenaar;
    }


    public float getAankoopprijs() {
        return aankoopprijs;
    }

    public String getGenre() {
        return genre;
    }

    public void setIsbn13(String isbn13) {
        String newstring = isbn13.replace("-","");
        int[] newint = new int[12];

        int laatstecijfer = Integer.parseInt(String.valueOf(isbn13.charAt(isbn13.length()-1)));
        for (int i =0 ; i<=6;i++){
            newint[i] = Integer.parseInt(newstring.substring(i, i + 1));
            newint[i+1] = Integer.parseInt(newstring.substring(i+1,i+2))*3;
        }
        int som = 0;
        for (var x:newint
             ) {
            som +=x;
           double modulo = som % 10;
           if (modulo-10 ==laatstecijfer)
            {
                this.isbn13 = isbn13;
            }
            else {
               System.out.println("error");
           }

        }

        }

    public String getIsbn13() {
        return isbn13;
    }

    @Override
    public String toString() {
        return "boek{" +
                "titel='" + titel + '\'' +
                ", auteur='" + auteur + '\'' +
                ", eigenaar='" + eigenaar + '\'' +
                ", aankoopprijs=" + aankoopprijs +
                ", genre='" + genre + '\'' +
                '}';
    }


}
