package be.vdab.Directories;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class GastenboekManager
{

    public void schrijf(Gastenboek gastenboek){
        try (var stream = new ObjectOutputStream(Files.newOutputStream(Path.of("/data/gastenboek.ser"))))
        {
            stream.writeObject(gastenboek);
        }
        catch (IOException ex) { System.out.println(ex); }
    }
    public Gastenboek lees() {
        Path X = Path.of("/data/gastenboeks.ser");
        if (Files.exists(X)) {
            try (var stream = new ObjectInputStream(Files.newInputStream(X));) {
                return (Gastenboek) stream.readObject();
            } catch (Exception ex) {
                System.out.println(ex);
                return null;
            }
        }
        return new Gastenboek();
    }
}
