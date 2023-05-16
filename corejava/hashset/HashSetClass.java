package corejava.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetClass
{
    public static void main(String args[])
    {
        Set<Integer> intArray = new HashSet<Integer>();
        intArray.add(10);
        intArray.add(50);
        intArray.add(40);
        intArray.add(40);
        intArray.add(40);
        intArray.add(5);
        intArray.add(8);

        Iterator<Integer> ite = intArray.iterator();
        while(ite.hasNext())
            System.out.println(ite.next());

//        System.out.println(intArray);
    }
}
