Question:
Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive). 
    Write time and space complexity of your solution as comments in the source file.


Ans:
package corejava_assignments.assignment2;

import java.util.*;

public class Assignment2 {
    public static void main(String args[]) {
        HashMap<Character, Integer> hashmap = new HashMap<>();

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();

        for (int i = 0; i < str.length(); i++) { //Time Complexity = O(n)
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                if (hashmap.containsKey(c)) {
                    int count = hashmap.get(c);  //O(1)
                    hashmap.put(c, count + 1);
                } else {
                    hashmap.put(c, 1);//O(1)
                }
            }
        }

        for (char j : hashmap.keySet()) { //O(n)
            System.out.println("key:" + j + " " + "value:" + " " + hashmap.get(j));
        }

        if (hashmap.keySet().containsAll(getAlphabets())) {
            System.out.println("Given String contains all alphabets");
        } else {
            System.out.println("Given String doesn't contain all alphabets");
        }
    }

    private static Set<Character> getAlphabets() {
        Set<Character> alphabets = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabets.add(c);
        }
        return alphabets;
    }
}
