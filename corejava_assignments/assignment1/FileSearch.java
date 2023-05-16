package corejava_assignments.assignment1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String homeDirectory = System.getProperty("user.home");
        File dir = new File(homeDirectory);
        if (!dir.isDirectory()) {
            System.out.println(homeDirectory + " is not a directory.");
            return;
        }
        while (true) {
            System.out.println("Enter a regular expression to search for files (or 'exit' to quit):");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            Pattern pattern = Pattern.compile(input);
            File[] files = dir.listFiles();
            for (File file : files) {
                String absolutePath = file.getAbsolutePath();
                Matcher matcher = pattern.matcher(absolutePath);
                if (matcher.find()) {
                    System.out.println(absolutePath);
                }
            }
        }
    }
}

