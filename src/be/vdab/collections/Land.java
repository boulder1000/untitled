package be.vdab.collections;

import be.vdab.collections.utils.LandException;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Land {
    private String landCode,landnaam,hoofdstad;

    private BigInteger aantalInwoners = BigInteger.ZERO;
    private BigDecimal oppervlakte = BigDecimal.ZERO;

    public Land(String landCode, String landnaam, String hoofdstad, BigInteger aantalInwoners, BigDecimal oppervlakte) {
        setLandCode(landCode);
        setLandnaam(landnaam);
        setHoofdstad(hoofdstad);
        setAantalInwoners(aantalInwoners);
        setOppervlakte(oppervlakte);
    }

    public String getLandCode() {
        return landCode;
    }

    public void setLandCode(String landCode) throws LandException {
        if (landCode != null && !(landCode.isEmpty()))
        {
            this.landCode = landCode;
        }
        else {
            throw new LandException("foute landcode");
        }
    }

    public String getLandnaam() {
        return landnaam;
    }

    public void setLandnaam(String landnaam) throws LandException {
        if (landCode != null && !(landCode.isEmpty()))
            {
                this.landnaam = landnaam;
            }
        else {
            throw new LandException("foute landnaam");
        }
        }

    public String getHoofdstad() {
        return hoofdstad;
    }

    public void setHoofdstad(String hoofdstad) throws LandException{
        if (landCode != null && !(landCode.isEmpty()))
        {
            this.hoofdstad = hoofdstad;
        }
        else {
            throw new LandException("foute hoofdstad");
        }
    }

    public BigInteger getAantalInwoners() {
        return aantalInwoners;
    }

    public void setAantalInwoners(BigInteger aantalInwoners) throws LandException{
        if (aantalInwoners != BigInteger.ZERO) {
            this.aantalInwoners = aantalInwoners;
        }
        else {
            throw new LandException("fout aantalinwoners");
        }
    }

    public BigDecimal getOppervlakte() {
        return oppervlakte;
    }

    public void setOppervlakte(BigDecimal oppervlakte) throws LandException{
        if (oppervlakte != BigDecimal.ZERO) {

            this.oppervlakte = oppervlakte;
        }
        else {
            throw new LandException("foute oppervlakte");
        }
    }
    public BigDecimal berekenBevolkingsdichtheid(){
        return new BigDecimal(aantalInwoners).divide(oppervlakte,2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return "Land{" +
                "landCode='" + landCode + '\'' +
                ", landnaam='" + landnaam + '\'' +
                ", hoofdstad='" + hoofdstad + '\'' +
                ", aantalInwoners=" + aantalInwoners +
                ", oppervlakte=" + oppervlakte +
                '}';
    }
}
