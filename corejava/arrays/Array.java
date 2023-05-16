package corejava.arrays;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {
    public static void main(String args[]) throws IOException {
        int numbers[] = new int[5];

//        Scanner scan = new Scanner(System.in);

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader scan = new BufferedReader(in);

        for(int i=0;i<5;i++)
        {

            numbers[i]=Integer.parseInt(scan.readLine());
        }

//        for(int n:numbers)
//        {
//            System.out.print(n+" ");
//        }
        System.out.println(numbers);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int[] num = {70,20,40,10,44};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

    }
}
