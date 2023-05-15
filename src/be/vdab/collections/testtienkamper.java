package be.vdab.collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class testtienkamper
{
    public static void main(String[] args) {
        var al = new ArrayList<tienkamper>();
        var tree = new TreeSet<tienkamper>();
        var atleet1 = new  tienkamper("bdr",10);
        var atleet2 = new  tienkamper("adggggr",105);
        var atleet3 = new  tienkamper("abjjiii",108885);
        al.add(atleet1);
        al.add(atleet2);
        al.add(atleet3);
        tree.add(atleet1);
        tree.add(atleet2);
        tree.add(atleet3);
        for (var x:al) {
            System.out.println(x);
        }
        for (var x:tree) {
            System.out.println(x);
        }
    }
}
