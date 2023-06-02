package be.vdab.zoo;

import java.util.Comparator;

public class Krokodil extends Reptiel implements Comparator<Krokodil> {
    private double lengteinMeter, gewichtinKilo;

    public Krokodil(String naam, double lengteinMeter, double gewichtinKilo) {
        super(naam);

            if (lengteinMeter < 0) {
                throw new IllegalArgumentException("lengte mag niet onder 0");
            } else {
                this.lengteinMeter = lengteinMeter;

            }
            if (gewichtinKilo < 0) {
                throw new IllegalArgumentException("gewicht mag niet onder 0");
            } else {
                this.gewichtinKilo = gewichtinKilo;

            }
    }

    public double getGewichtinKilo() {
        return gewichtinKilo;
    }

    @Override
    public String toString() {
        return "krokodil{" +
                "lengteinMeter=" + lengteinMeter +
                ", gewichtinKilo=" + gewichtinKilo +
                "} " + super.toString();
    }


    @Override
    public int compare(Krokodil o1, Krokodil o2) {
        if (o1.gewichtinKilo == o2.gewichtinKilo)
            return 0;
        else if (o1.gewichtinKilo > o2.gewichtinKilo)
            return 1;
        else {
            return -1;
        }
    }
}
