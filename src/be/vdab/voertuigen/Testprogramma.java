package be.vdab.voertuigen;

public class Testprogramma {
    public static void main(String[] args) {
        var personenwagen1 = new personenwagen("srf", 500.5F, 50, 10.5F, "GT4654", 5, 4);
        var vrachtwagen1 = new vrachtwagen("ffff", 5000.5F, 4000, 20.5F, "JGG75G", 2000.5F);
        System.out.println(personenwagen1);
        System.out.println(personenwagen1.toon());
        System.out.println(personenwagen1.getKyotoScore());
        System.out.println(vrachtwagen1);
        System.out.println(vrachtwagen1.toon());
        System.out.println(vrachtwagen1.getKyotoScore());

        var Voertuigen = new voertuig[2];
        Voertuigen[0] = personenwagen1;
        Voertuigen[1] = vrachtwagen1;

        for (var Voertuig : Voertuigen) {
            System.out.println(Voertuig.toon());
            System.out.println(Voertuig);
            System.out.println(Voertuig.getKyotoScore());

        }
        var stookketel = new stookketel();
        stookketel.setCOnorm(20.2F);
        var vervuilers = new Vervuiler[3];
        vervuilers[0] = personenwagen1;
        vervuilers[1] = vrachtwagen1;
        vervuilers[2] = stookketel;
        for (var vervuiler : vervuilers
        ) {
            System.out.println(vervuiler.berekenVervuiling());

        }
        for (var Voertuig : Voertuigen) {
            Voertuig.geefMilieuData();
            Voertuig.geefPrivateData();
        }
    }
}

