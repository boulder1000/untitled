package be.vdab.datum;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class maintest {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        System.out.println("geef geboortedatum in");
        var Timestring = scanner.next();
        var datum = LocalDate.parse(Timestring,formatter);
        var nu = LocalDate.now();
        var period = Period.between(datum,nu);
        System.out.println(datum.getDayOfWeek());
        System.out.println(period.getYears());

    }
}
