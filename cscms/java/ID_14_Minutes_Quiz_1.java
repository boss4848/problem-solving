import java.util.Scanner;

public class ID_14_Minutes_Quiz_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.print(n / 60 / 24 / 365);
        System.out.print(" " + n / 60 / 24 % 365);
        sc.close();
    }
}