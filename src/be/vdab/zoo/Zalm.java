package be.vdab.zoo;

public class Zalm extends Vis{
    private String kleur;

    @Override
    public String toString() {
        return "Zalm{" +
                "kleur='" + kleur + '\'' +
                "} " + super.toString();
    }

    public Zalm(String naam, WelkeVis welkeVis, String kleur) {
        super(naam, welkeVis);
        this.kleur = kleur;


    }
}
