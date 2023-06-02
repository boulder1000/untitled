package be.vdab.zoo;

public class krokodil extends Reptiel{
    private double lengteinMeter,gewichtinKilo;

    public krokodil(String naam, double lengteinMeter, double gewichtinKilo) {
        super(naam);
        if (lengteinMeter <0){
            throw new IllegalArgumentException("lengte mag niet onder 0");
        }
        else {
            this.lengteinMeter = lengteinMeter;

        }
        if (gewichtinKilo <0){
            throw new IllegalArgumentException("gewicht mag niet onder 0");
        }
        else {
            this.gewichtinKilo = gewichtinKilo;

        }
    }

    public double sorteerOpGewicht(krokodil i1, krokodil i2) {
        if (i1.gewichtinKilo == i2.gewichtinKilo)
            return 0;
        else if (i1.gewichtinKilo > i2.gewichtinKilo)
            return 1;
        else {
            return -1;
        }



    }

    @Override
    public String toString() {
        return "krokodil{" +
                "lengteinMeter=" + lengteinMeter +
                ", gewichtinKilo=" + gewichtinKilo +
                "} " + super.toString();
    }
}
