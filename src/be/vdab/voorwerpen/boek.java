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

    public boek(String titel, String auteur, float aankoopprijs, String genre, String isbn13) {
        if (!(titel == null) || titel.isEmpty()) {
            this.titel = titel;
        }
        if (!(auteur == null) || auteur.isEmpty()) {
            this.auteur = auteur;
        }
        if (aankoopprijs >= 0) {
            this.aankoopprijs = aankoopprijs;
        }
        if (!(genre == null) || genre.isEmpty()) {
            this.genre = genre;
        }
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

    public void setIsbn13(String isbn13) throws Isbn13Exception{



        String newstring = isbn13.replace("-", "");
        int[] newint = new int[12];

        int laatstecijfer = Integer.parseInt(String.valueOf(isbn13.charAt(isbn13.length() - 1)));
        for (int i = 0; i < 12; i++) {
            if ((i+1) % 2 != 0) {
                newint[i] = Integer.parseInt(String.valueOf(newstring.charAt(i)));
            }
            else {
                newint[i] = Integer.parseInt(String.valueOf(newstring.charAt(i))) * 3;
            }
        }
        int som = 0;

        for (var x : newint)
        {
            som += x;
        }
        double modulo = som % 10;
        if (10 - modulo== laatstecijfer) {
            this.isbn13 = isbn13;
        } else {
            throw new Isbn13Exception("fout Isbn13 nummer");
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
