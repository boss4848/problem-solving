import java.util.Scanner;

public class ID_114_Jin_and_his_numbers_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            long sum = 0;
            sum = (b * (b + 1) / 2) - ((a - 1) * a / 2);
            System.out.println(sum);
        }

        sc.close();
    }
}