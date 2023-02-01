import java.util.Arrays;
import java.util.Scanner;

public class ID_94_Swap_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double arr[] = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        // 0 1 2 3 4 5 6
        // 6 1 4 3 2 5 0
        // 1 2 3 4 5 6 7 8 9 10
        // 10 2 8 4 6 5 7 3 9 1
        Arrays.sort(arr);
        for (int i = 0; i < n / 2; i++) {
            if (i % 2 == 0) {
                double temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f ", arr[i]);
        }

        sc.close();
    }
}