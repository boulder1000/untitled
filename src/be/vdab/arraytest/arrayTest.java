package be.vdab.arraytest;
import java.lang.Math;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class arrayTest {
    public static void main(String[] args)
    {
        int x = 0;
        var getallen = new int[4];
        for (int getal:getallen) {
            int R = ThreadLocalRandom.current().nextInt(1,100 + 1);
            x+=1;
            getallen[x-1] = R;
            System.out.println(getallen[x-1]);
        }
        
        int total = Arrays.stream(getallen).sum();
        System.out.println(total);
        System.out.println(total / getallen.length);

    }
}
