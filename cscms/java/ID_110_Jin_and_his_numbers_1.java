import java.util.Scanner;

public class ID_110_Jin_and_his_numbers_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum = i + sum;
        }
        System.out.println(sum);

        sc.close();
    }
}