package be.vdab.enumj;

public class Persoon {
        private final String voornaam;
        private final String familienaam;
        private final Geslacht geslacht;
        public Persoon(String voornaam, String familienaam, Geslacht geslacht) {
            this.voornaam = voornaam;
            this.familienaam = familienaam;
            this.geslacht = geslacht;
        }
        @Override
        public String toString() {
            return voornaam + ' ' + familienaam + ' ' + geslacht;
        }
    }

