import java.util.Scanner;

public class ID_87_Sum_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(digit(num));
        sc.close();

    }

    public static long digit(long n) {

        if (n == 0) {
            return 0;
        } else {
            return n % 10 + digit(n / 10);
        }

    }
}