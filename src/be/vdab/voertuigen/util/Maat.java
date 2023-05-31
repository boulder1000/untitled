package be.vdab.voertuigen.util;

public enum Maat {
    CENTIMETER(0.01),DECIMETER(0.1),METER(1);
    private double meter;

    Maat(double i) {
        this.meter = i;
    }

    public double getMeter() {
        return meter;
    }
}
