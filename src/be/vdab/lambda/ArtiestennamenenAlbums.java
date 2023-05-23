package be.vdab.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class ArtiestennamenenAlbums {
    public static void main(String[] args) throws IOException {


        var albumsartists = Path.of("/data/albumsartists.txt");
        try (var stream = Files.lines(albumsartists)) {
            var albumsPerArtiest = stream.collect(Collectors.groupingBy(regel -> regel.substring(regel.indexOf(',') + 1)));
            albumsPerArtiest.entrySet().stream()
                    .sorted((entry1, entry2) -> entry1.getKey().compareTo(entry2.getKey()))
                    .forEach(entry -> {
                        System.out.println(entry.getKey());
                        entry.getValue().stream()
                                .map(regel -> regel.substring(0, regel.indexOf(',')))
                                .sorted()
                                .forEach(album -> System.out.println("\t" + album));
                    });
        }


        catch (Exception ex){
            System.err.println(ex);
        }
    }
}

