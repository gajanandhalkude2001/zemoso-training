package corejava_assignments.assignment11;

import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.io.IOException;

public class CharCount {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java CharCount <file-name>");
            return;
        }
        String fileName = args[0];
        Map<Character, Integer> charCountMap = new HashMap<>();
        try {
            TextFile textFile = new TextFile(fileName);
            String content = textFile.read();
            for (int i = 0; i < content.length(); i++) {
                char c = content.charAt(i);
                if (charCountMap.containsKey(c)) {
                    int count = charCountMap.get(c);
                    charCountMap.put(c, count + 1);
                } else {
                    charCountMap.put(c, 1);
                }
            }
            textFile.write("char_count.txt", charCountMap.toString());
            for (char c : charCountMap.keySet()) {
                System.out.println(c + " : " + charCountMap.get(c));
            }
            System.out.println("Character count saved to char_count.txt");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

