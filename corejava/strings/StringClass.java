package corejava.strings;
import java.lang.*;
public class StringClass {
    public static void main(String a[]) {
        String str = "Zemoso";
        str= str+"hii";
        str.replace('m','n');
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(3));

        System.out.println(str.substring(2,4));

    }
}
