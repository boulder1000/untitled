package be.vdab.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class beginletterMain {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        var haskmap = new HashMap<Character, Integer>();
        strings.add("aap");
        strings.add("been");
        strings.add("boter");
        strings.add("dier");
        strings.add("varken");
        strings.add("vee");
        for (var woord : strings) {
            if (haskmap.containsKey(woord.charAt(0))) {
                haskmap.put(woord.charAt(0), haskmap.get(woord.charAt(0)) + 1);
            }
            else {
                haskmap.put(woord.charAt(0),1);
            }
        }
        System.out.println(haskmap);
        System.out.println(haskmap.size());
        System.out.println(haskmap.isEmpty());
        System.out.println(haskmap.keySet());
        System.out.println(haskmap.values());
        System.out.println(haskmap.entrySet());


    }

}
