package be.vdab;

import be.vdab.winkel.Catalogus;
import be.vdab.winkel.Mandje;

public class mainWinkel {
    public static void main(String[] args) {

        var catalogus = new Catalogus();
        var mandje = new Mandje();
        var teller = 1;
        for (var product : catalogus.getProducten()) {
            if (teller % 2 == 0) {
                mandje.add(product, teller);
            }
            teller++;
        }
        System.out.println("U kocht:");
        for (var entry : mandje.getWinkelmand().entrySet()) {
            System.out.println((entry.getKey()) + "; aantal stuks: "
                    + entry.getValue());
        }
        System.out.println();
        System.out.println("U kocht voor een totaal van: " +
                mandje.getTotaleprijs());
    }
}
