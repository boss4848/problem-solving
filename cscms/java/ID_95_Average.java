import java.util.Scanner;

public class ID_95_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double[][] arr = new double[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Average of each row:");

        for (int i = 0; i < a; i++) {
            double sum = 0;
            for (int j = 0; j < b; j++) {
                sum = arr[i][j] + sum;
            }
            System.out.print(String.format("%.2f", sum / b) + " ");

        }
        System.out.println();
        // 00 01 02
        // 10 11 12
        System.out.println("Average of each column:");

        for (int i = 0; i < b; i++) {
            double sum2 = 0;
            for (int j = 0; j < a; j++) {
                sum2 = arr[j][i] + sum2;
            }
            System.out.print(String.format("%.2f", sum2 / a) + " ");

        }

        sc.close();
    }
}