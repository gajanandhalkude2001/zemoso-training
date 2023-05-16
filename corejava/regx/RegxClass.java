package corejava.regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxClass {
    public static void main(String args[])
    {
        Pattern pattern = Pattern.compile("xyz");
        Matcher matcher = pattern.matcher("xy");
        System.out.println(Pattern.matches("d","y"));
        System.out.println(Pattern.matches("d+","111"));

    }
}
