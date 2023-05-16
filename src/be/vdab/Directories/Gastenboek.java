package be.vdab.Directories;

import java.io.Serializable;
import java.util.ArrayList;

public class Gastenboek implements Serializable
{
    private ArrayList<GastenboekEntry> list = new ArrayList<>();

    public Gastenboek(ArrayList<GastenboekEntry> list) {
        this.list = list;
    }

    public ArrayList<GastenboekEntry> getList() {
        return list;
    }
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
