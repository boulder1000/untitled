package be.vdab.Directories;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Gastenboek implements Serializable
{
    private final List<GastenboekEntry> list = new ArrayList<>();

    public void addToList(GastenboekEntry gastenboekEntry){
       list.add(gastenboekEntry);
    }

    @Override
    public String toString() {
        return "Gastenboek{" +
                "list=" + list +
                '}';
    }
}
