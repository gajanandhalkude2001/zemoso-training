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
