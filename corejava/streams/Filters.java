package corejava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filters {
    public static void main(String args)
    {
        List<String> myList = Arrays.asList("Gundoor","Jukkal","Kamareddy","Telangana");
        List<String> myEvenList = new ArrayList<>();
//1-way        myEvenList = myList.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());
//        System.out.println(myList);
//  2-way      myList.stream().filter(str->str.length()>6 && str.length()<8).forEach(str-> System.out.println(str));
        myList.stream().filter(str->str.length()>6 && str.length()<8).forEach(System.out::println);
    }
}
