package corejava.linkedhashset;

import java.util.Set;

public class LinkedHashSet {
    public static void main(String args[])
    {
        Set<Integer> set = new java.util.LinkedHashSet<>();
        set.add(100);
        set.add(200);
        set.add(600);
        set.add(500);
        set.add(100);
        set.add(100);
        set.add(400);
        System.out.println(set);
    }
}
