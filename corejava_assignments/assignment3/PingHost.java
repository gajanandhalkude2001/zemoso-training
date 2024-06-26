Question:
Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.

Use the system ping utility, do not use any deprecated methods.

Ans:
package corejava_assignments.assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PingHost {
    public static double medianPingTime(String host) {
        List<Double> pingTimes = new ArrayList<>();
        try {
            String command = "";
            if (System.getProperty("os.name").startsWith("Windows")) {
                command = "ping -n 5 " + host; // Windows command
            }
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("time=")) {
                    double time = Double.parseDouble(line.substring(line.lastIndexOf("=") + 1, line.lastIndexOf("ms")).trim());
                    pingTimes.add(time);
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Collections.sort(pingTimes);
        int size = pingTimes.size();
        if (size % 2 == 0) {
            return (pingTimes.get(size / 2 - 1) + pingTimes.get(size / 2)) / 2;
        } else {
            return pingTimes.get(size / 2);
        }
    }

    public static void main(String[] args)
    {
        System.out.println(medianPingTime("www.youtube.com"));
    }
}
