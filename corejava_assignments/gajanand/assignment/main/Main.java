package gajanand.assignment.main;
import gajanand.data.*;
import gajanand.singleton.*;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        // create object of first class and call both methods to print values
        DefaultInitializationAssignment obj1 = new DefaultInitializationAssignment();
        obj1.printVariables();
        obj1.printLocalVariables();

        // create object of second class using static method and call method to print the String
        SingletonClass obj2 = SingletonClass.getInstance("Hello, world!");
        obj2.printString();
    }
}

