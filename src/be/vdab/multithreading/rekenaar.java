package be.vdab.multithreading;

public class rekenaar implements Runnable {
    private final double[] getallen;
    private final int vanafIndex;
    private final int totIndex;
    private double gemiddelde;

    public rekenaar(double[] getallen, int vanafIndex, int totIndex) {
        this.getallen = getallen;
        this.vanafIndex = vanafIndex;
        this.totIndex = totIndex;
    }

    @Override
    public void run() {
        var totaal = 0;
        for (var i = vanafIndex; i != totIndex; i++) {
            totaal += getallen[i];
        }
        gemiddelde = totaal / (totIndex - vanafIndex);
    }
    public double getGemiddelde() {
        return gemiddelde;
    }
}
