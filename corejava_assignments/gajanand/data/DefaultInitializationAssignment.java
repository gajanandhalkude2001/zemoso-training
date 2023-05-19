Question:
DefaultInitializationAssignment:
Create a class in a package yourname.assignment.data containing an int and a char member variables that are not initialized, add a method to print these variables. Add another method in the same class with two local variables and print their values without initializing them.

Create another class in package yourname.assignment.singleton containing a non static String member variable. Add a static method that takes String as parameter and initialize the member variable and then return object of that class. Add a non static method to print the String.

Create main class in package yourname.assignment.main, create object of first class and call both the methods to print the values. Create object of second class using static method and then call the other method to print the String.

One or more tasks mentioned above are not possible in JAVA, comment that part of the code with block comments and add the explanation for the same.

Ans:

package gajanand.data;

public class DefaultInitializationAssignment {
    int number;
    char character;

    public void printVariables() {
        System.out.println("Number: " + number);
        System.out.println("Character: " + character);
    }

    public void printLocalVariables() {
        int x=0 ;
        char c = 0;
        // Trying to print uninitialized local variables will result in a compilation error
        // Instead, we can declare them without initializing and print their default values
        System.out.println("Default value of int: " + x);//variable 'x' might not have been initialized
        System.out.println("Default value of char: " + c);//Variable 'c' might not have been initialized
    }
}
