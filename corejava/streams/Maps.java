package corejava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Maps {
    public static void main(String args[])
    {
        List<String> vehicles = Arrays.asList("Lorry","Car","Scooty","Honda");
        List<String> lengthVehicles = new ArrayList<>();
        vehicles.stream().map(x->x.length()).forEach(y-> System.out.println(y));

        lengthVehicles =vehicles.stream().map(in->in.toUpperCase()).collect(Collectors.toList());
        System.out.println(lengthVehicles);
    }
}
