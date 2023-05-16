package corejava.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListClass {
    public static void main(String ars[])
    {
        List<String> array = new ArrayList<String>();
        array.add("Hi");
        array.add("Hello");
        array.add("Namastey");
        array.add("Vanakkam");
        array.add("Hey");
        System.out.println(array);

        array.contains("Hello");

        for(String i:array)
        {
            System.out.println(i);
        }
    }
}
