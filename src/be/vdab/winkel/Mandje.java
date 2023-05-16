package be.vdab.winkel;

import java.math.BigDecimal;
import java.util.HashMap;

public class Mandje {
    private HashMap<Product, Integer> winkelmand = new HashMap<>();

    public void add(Product product,int aantal ){
        if (!winkelmand.containsKey(product)) {
            winkelmand.put(product, aantal);
        } else {
            var oudeAantal = winkelmand.get(product);
            winkelmand.put(product, oudeAantal + aantal);
        }



    }
    public void remove(Product product){
        winkelmand.remove(product);
    }

    public void clear(){
        winkelmand.clear();
    }
    public BigDecimal getTotaleprijs() {
        var totaalprijs = BigDecimal.ZERO;

        for (var entry : winkelmand.entrySet()) {
            totaalprijs = totaalprijs.add(entry.getKey().
                    getPrijs().multiply(BigDecimal.valueOf(entry.getValue())));

        }
        return totaalprijs;
    }

    public HashMap<Product, Integer> getWinkelmand() {
        return winkelmand;
    }

    @Override
    public String toString() {
        return "Mandje{" +
                "winkelmand=" + winkelmand +
                '}';
    }
}
