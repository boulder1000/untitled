package be.vdab.collections;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class testMain {
    public static void main(String[] args) {


         var land1 = new Land("yuj","yyyyu","tgg",BigInteger.valueOf(90000), BigDecimal.valueOf(905.90));
         var land2 = new Land("hdrrtdf","derff","fvbtt",BigInteger.valueOf(90800), BigDecimal.valueOf(985.9085));
         var land3 = new Land("trgdf","grdff","fvbttt",BigInteger.valueOf(9000), BigDecimal.valueOf(985.9150));
         var land4 = new Land("dtgf","dgtff","fervt",BigInteger.valueOf(900), BigDecimal.valueOf(985.9150));
         var land5 = new Land(",k,kn","dfzeff","fvjnt",BigInteger.valueOf(90800), BigDecimal.valueOf(985.9150));
         var land6 = new Land("dzgf","dfbtf","fv;lt",BigInteger.valueOf(90877700), BigDecimal.valueOf(985.9150));
         var land7 = new Land("drgf","dfftg","fvm;;lt",BigInteger.valueOf(98880800), BigDecimal.valueOf(985.9210));
         var land8 = new Land("drgf","dffht","fvtuuu",BigInteger.valueOf(90809990), BigDecimal.valueOf(985.9880));
         var land9 = new Land("dfaér'f","dfrf","fv;;t",BigInteger.valueOf(90888800), BigDecimal.valueOf(985.901485));
         var land10 = new Land("dffr","dfftg","fvtjjj",BigInteger.valueOf(90811100), BigDecimal.valueOf(985.98840));

         var al = new ArrayList<Land>();
         al.add(land1);
        al.add(land2);
        al.add(land3);
        al.add(land4);
        al.add(land5);
        al.add(land6);
        al.add(land7);
        al.add(land8);
        al.add(land9);
        al.add(land10);

        for (var land:al
             ) {
            System.out.println(land.toString());
            System.out.println(land.berekenBevolkingsdichtheid());

        }
}
}