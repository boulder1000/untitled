package be.vdab.voertuigen.util;

public final class Volume implements Comparable<Volume>{
    private final int breedte,hoogte,diepte;
    private final Maat maat;

    public Volume(int breedte, int hoogte, int diepte, Maat maat) {
        if (breedte >=0 ){
            this.breedte = breedte;
        }
        else throw new VolumeException("foute breedte");
        if (hoogte >=0){
            this.hoogte = hoogte;
        }
        else throw new VolumeException("foute hoogte");
        if (diepte >=0){
            this.diepte = diepte;
        }
        else throw new VolumeException("foute diepte");
        this.maat = maat;
    }
    public double getVolume(){

        return breedte*hoogte*diepte*maat.getMeter();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Volume volume)) return false;
        return breedte == volume.breedte && hoogte == volume.hoogte && diepte == volume.diepte && maat == volume.maat;
    }

    @Override
    public int compareTo(Volume o) {
        return 0;
    }
}
