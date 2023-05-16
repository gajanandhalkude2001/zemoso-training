package corejava_assignments.assignment11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFile {
    private String fileName;

    public TextFile(String fileName) {
        this.fileName = fileName;
    }

    public String read() throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    public void write(String outputFileName, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            writer.write(content);
        }
    }
}

