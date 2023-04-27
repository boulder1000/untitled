package be.vdab.voertuigen;

public class stookketel implements Vervuiler{
    private float COnorm;

    public float getCOnorm() {
        return COnorm;
    }

    public void setCOnorm(float COnorm) {
        this.COnorm = COnorm;
    }

    @Override
    public double berekenVervuiling() {
        return getCOnorm() * 100;
    }
}
