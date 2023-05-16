package be.vdab.Directories;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class GastenboekManager
{

    public void Serialize(Gastenboek gastenboek){
        try (var stream = new ObjectOutputStream(Files.newOutputStream(Path.of("/data/punt.ser"))))
        {
            stream.writeObject(gastenboek);
        }
        catch (IOException ex) { System.out.println(ex); }
    }
    public void Deserialize(){
        try (var stream = new ObjectInputStream(Files.newInputStream( Path.of("/data/punt.ser"))); ){
        return (Gastenboek) stream.readObject();
        }
        catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
