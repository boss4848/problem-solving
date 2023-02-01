import java.util.Scanner;
import java.util.Arrays;

public class ID_92_Second_min_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double[] arr = new double[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextDouble();
        }
        Arrays.sort(arr);
        System.out.print(String.format("%.2f", arr[1]) + " ");
        System.out.print(String.format("%.2f", arr[a - 2]));

        sc.close();
    }
}