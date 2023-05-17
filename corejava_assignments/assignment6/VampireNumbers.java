Question:
Operators and More:

1. A vampire number v is a number with an even number of digits n, that can be factored into two numbers x and y each with n/2 digits and not both with trailing zeroes, where v contains precisely all the digits from x and from y, in any order. Write a java program to print first 100 vampire numbers.

2. Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.

3. Create a class with a constructor that takes a String argument. During construction, print the argument. Create an array of object references to this class, but don’t actually create objects to assign into the array. When you run the program, notice whether the initialization messages from the constructor calls are printed.

4. Complete the previous exercise by creating objects to attach to the array of references.

Answer:
package corejava_assignments.assignment6;

import java.util.Arrays;
public class VampireNumbers {

    public static void main(String[] args) {
        int count = 0;
        long number = 10;
        while (count < 100) {
            if (isVampireNumber(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
    public static boolean isVampireNumber(long number)
    {
        String numStr = Long.toString(number);
        int length = numStr.length();
        if (length % 2 != 0) {
            return false;
        }
        for (long i = 10; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                String factor1Str = Long.toString(i);
                String factor2Str = Long.toString(number / i);
                if (factor1Str.length() != length / 2 || factor2Str.length() != length / 2) {
                    continue;
                }
                char[] numChars = numStr.toCharArray();
                char[] factorChars = (factor1Str + factor2Str).toCharArray();
                Arrays.sort(numChars);
                Arrays.sort(factorChars);
                if (Arrays.equals(numChars, factorChars)) {
                    return true;
                }
            }
        }
        return false;
    }
}

