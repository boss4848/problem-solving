import java.util.Scanner;

public class ID_59_Raining_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buckets = sc.nextInt();
        int days = sc.nextInt();
        int[] rain = new int[buckets];
        for (int i = 0; i < days; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = a - 1; j <= b - 1; j++) {
                rain[j] += 1;
                // 0 0 0 0 0
                // 0 1 1 0 0
                // 1 1 1 1 0
                // 0 0 0 1 1
            }
        }
        for (int i = 0; i < rain.length; i++) {
            System.out.print(rain[i] + " ");
        }

        sc.close();
    }
}