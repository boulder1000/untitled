package be.vdab.lambda;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class OnevenGetallen {
    public static void main(String[] args) {
        var array = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("geef getal in");
        for (int getal; (getal = scanner.nextInt()) != 0;) {
            array.add(getal);
            System.out.println("geef getal");
        }

        array.stream().filter(getal -> getal % 2 != 0).sorted((getal1,getal2) -> getal2 -getal1).forEach(getal -> System.out.println(getal));
    }
}
