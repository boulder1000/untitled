package be.vdab.lambda;

import java.util.stream.Stream;
public class kleinsteoppervlakteMain {
    public static void main(String[] args) {
        Stream.of(new kleinsteoppervlakteMain(6, 2), new kleinsteoppervlakteMain(3, 1), new kleinsteoppervlakteMain(5, 4))
                .map(rechthoek -> rechthoek.getOppervlakte())
                .sorted()
                .forEach(oppervlakte -> System.out.println(oppervlakte));
    }
}
