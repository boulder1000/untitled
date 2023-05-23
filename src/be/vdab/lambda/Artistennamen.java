package be.vdab.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Artistennamen {
    public static void main(String[] args) throws IOException {


        var albumsartists = Path.of("/data/albumsartists.txt");
        try (var stream = Files.lines(albumsartists)) {
            stream.map(artist ->artist.substring(artist.indexOf(",")+1)).sorted().distinct().forEach(artist -> System.out.println(artist));
        }
        catch (Exception ex){
            System.err.println(ex);
        }
    }
}

