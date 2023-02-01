import java.util.Scanner;

public class ID_71_Binary_Number_Final_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(binary(n));
        sc.close();
    }

    public static String binary(int n) {
        if (n == 0 || n == 1) {
            return n + "";
        } else {
            return binary(n / 2) + "" + n % 2;
        }
    }
}
