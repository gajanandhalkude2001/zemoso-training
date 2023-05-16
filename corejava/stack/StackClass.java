package corejava.stack;

import java.util.List;
import java.util.Stack;

public class StackClass {
    public static void main(String args[])
    {
        Stack<String> newstack = new Stack<String>();
        Stack<String> addall = new Stack<String>();
        newstack.push("Aa");
        newstack.push("Bb");
        newstack.push("Cc");
        System.out.println(newstack);
        System.out.println(newstack.pop());
        System.out.println(newstack.peek());

        addall.push("Hyd");
        addall.push("Krmngr");
        addall.push("Adlbd");

        newstack.addAll(addall);
        System.out.println(newstack);
        System.out.println(addall.lastElement());
    }
}
