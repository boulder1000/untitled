package be.vdab.voertuigenOef;

import java.util.Comparator;

public class compare implements Comparator<voertuig> {

    @Override
    public int compare(voertuig o1, voertuig o2) {
        return o1.getNummerplaat().compareTo(o2.getNummerplaat());
    }
}
