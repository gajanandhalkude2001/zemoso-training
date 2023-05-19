package corejava.hashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashmapClass {
    public static void main(String args[])
    {
        Map<String, Integer> mymap = new HashMap<String, Integer>();
//        Map<String, Integer> mymap1 = new Hashtable<String, Integer>();
        System.out.println(mymap.getClass());

        mymap.put("Manmath",80);
        mymap.put("Srikanth",60);
        mymap.put("Vaishnavi",50);
        mymap.put("Shiva",20);
        mymap.put("Akshay",10);

        if(!mymap.containsKey("Satish"))
            mymap.put("Satish",100);

        System.out.println(mymap.keySet());
        System.out.println(mymap.get("Srikanth"));
        System.out.println(mymap.values());
        System.out.println(mymap.remove("Shiva"));

        for(String s:mymap.keySet())
        {
            System.out.println(s+":"+mymap.get(s));
        }
    }
}
