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

