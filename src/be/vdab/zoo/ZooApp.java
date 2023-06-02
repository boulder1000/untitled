package be.vdab.zoo;

public class ZooApp {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.VoegDierToe(new Struisvogel("bob",Vliegen.vliegen));

    }
}
