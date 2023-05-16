package corejava.strings;

public class StringBuilderClass {
    public static void main(String args[])
    {
        StringBuilder str = new StringBuilder("Gaja");
        StringBuffer sb = new StringBuffer("Halkude");
        str.append("nand");
        str.insert(0,"Hii ");
        sb.reverse();
        System.out.println(str);

    }
}
