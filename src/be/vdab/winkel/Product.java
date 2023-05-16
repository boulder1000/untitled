package be.vdab.winkel;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
    private String omschrijving;
    private BigDecimal prijs;

    public Product(String omschrijving, BigDecimal prijs) {
        this.omschrijving = omschrijving;
        this.prijs = prijs;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public BigDecimal getPrijs() {
        return prijs;
    }

    public void setPrijs(BigDecimal prijs) {
        this.prijs = prijs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(omschrijving, product.omschrijving) && Objects.equals(prijs, product.prijs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(omschrijving, prijs);

    }

    @Override
    public String toString() {
        return "Product{" +
                "omschrijving='" + omschrijving + '\'' +
                ", prijs=" + prijs +
                '}';
    }
}

