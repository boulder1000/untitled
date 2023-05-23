package be.vdab.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SterrenbeeldenZoeken {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String inputwoord = scanner.next().toUpperCase();
        var sterrebeelden = Path.of("/data/sterrenbeelden.txt");
        try (var stream = Files.lines(sterrebeelden)) {
            stream.filter(woord ->woord.toUpperCase().contains(inputwoord)).forEach(woord -> System.out.println(woord));

        }
catch (Exception ex){
    System.err.println(ex);
}
    }
}