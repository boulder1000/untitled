package be.vdab.zoo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Beer extends Zoogdier {
    private List<String> leefgebied;

    public Beer(String naam, List<String> leefgebied) {
        super(naam);
        setLeefgebied(leefgebied);
    }

    @Override
    public String toString() {
        return "beer{" +
                "l=" + leefgebied +
                "} " + super.toString();
    }

    public void setLeefgebied(List<String> leefgebied) {
        try {
            var x = false;
            Set<String> set = new HashSet<>(leefgebied);
            if (set.size() < leefgebied.size()) {
                x = true;
            }

            if (leefgebied.isEmpty()) {
                throw new IllegalArgumentException("mag niet leeg zijn");
            } else if (x == true) {
                throw new IllegalArgumentException("mag geen duplicaten hebben");
            } else {
                this.leefgebied = leefgebied;
            }

        }
        catch (Exception ex){
            System.err.println(ex);
    }
}}

