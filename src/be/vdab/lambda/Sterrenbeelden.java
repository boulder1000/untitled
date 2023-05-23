package be.vdab.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Optional;

public class Sterrenbeelden {
    public static void main(String[] args) throws IOException {


        var sterrebeelden = Path.of("/data/sterrenbeelden.txt");
        try (var stream = Files.lines(sterrebeelden)) {
            stream.forEach(woord -> System.out.println(woord.toUpperCase()));

        }
catch (Exception ex){
    System.err.println(ex);
}
    }
}