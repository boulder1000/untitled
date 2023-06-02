package be.vdab.zoo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class beer extends zoogdier{
    private List<String> l;

    public beer(String naam, List<String> l) {
        super(naam);
        setL(l);
    }

    @Override
    public String toString() {
        return "beer{" +
                "l=" + l +
                "} " + super.toString();
    }

    public void setL(List<String> l) {
        var x = false;
        Set<String> set = new HashSet<>(l);
        if (set.size() < l.size()){
            x = true;
        }

        if (l.isEmpty()){
            throw new IllegalArgumentException("mag niet leeg zijn");
        } else if (x = true) {
            throw new IllegalArgumentException("mag geen duplicaten hebben");
        }
        else {
            this.l = l;
        }



    }
}
