package corejava.treeset;

import java.util.TreeSet;
import java.util.Set;
public class TreeSetClass {
    public static void main(String ar[])
    {
        Set<Integer> arr = new TreeSet<Integer>();
        arr.add(100);
        arr.add(50);
        arr.add(70);
        arr.add(20);
        arr.add(70);
        arr.add(145);
        arr.add(100);
        arr.add(100);
        System.out.println(arr.contains(20));
        System.out.println(arr.isEmpty());

//        arr.clear();
        System.out.print(arr);
    }
}
