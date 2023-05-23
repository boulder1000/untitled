package be.vdab.lambda;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class Landcodemain {
    private static final Path landcodes = Path.of("/data/landcodes.txt");

    private static Optional<String> land(String landcode) {
        try (var reader = Files.newBufferedReader(landcodes)) {
            for (String regel; (regel = reader.readLine()) !=null;)
            {
                if (landcode.equals(regel.substring(0,2))){
                    return Optional.of(regel.substring(3,regel.length()));
                }
            }
        }
        catch (Exception ex) {
            System.err.println(ex);
        }

        return Optional.empty();
    }

    public static void main(String[] args) {
       land("IT").ifPresent(land -> System.out.println(land));
    }
}
