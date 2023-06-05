package be.vdab.zoo;

import java.util.List;

public class Beer extends Zoogdier {
    private  List<String> leefgebied;

    public Beer(String naam, List<String> leefgebied) {
        super(naam);

        this.leefgebied = leefgebied;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "leefgebied=" + leefgebied +
                "} " + super.toString();
    }

    public void setLeefgebied(String strGebied) {
            if (this.leefgebied.contains(strGebied)){
                throw new IllegalArgumentException("mag geen duplicaten hebben");
            }
            else if (strGebied.isEmpty()) {
                throw new IllegalArgumentException("mag niet leeg zijn");
            }
        else {
            this.leefgebied.add(strGebied);
            }


}



    }



