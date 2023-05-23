package be.vdab.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Landnamen_sorteren {
    public static void main(String[] args) throws IOException {


        var landnaam = Path.of("/data/landcodes.txt");
        try (var stream = Files.lines(landnaam)) {
            stream.map(land ->land.substring(land.indexOf(" ")+1)).sorted().distinct().forEach(land -> System.out.println(land));
        }
        catch (Exception ex){
            System.err.println(ex);
        }
    }
}
