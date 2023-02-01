import java.util.Scanner;

public class ID_79_The_1D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextFloat();
        }

        // Summation
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum = arr[i] + sum;
        }
        System.out.println("Summation: " + String.format("%.2f", sum));
        System.out.println("Average: " + String.format("%.2f", sum / n));
        float max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max: " + String.format("%.2f", max));
        float min = arr[0];
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Min: " + String.format("%.2f", min));

        sc.close();
    }
}