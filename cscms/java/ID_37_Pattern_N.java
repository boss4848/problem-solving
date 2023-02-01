import java.util.Scanner;

public class ID_37_Pattern_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 1; i++) {
            System.out.print("*");
        }
        for (int i = 1; i <= n - 2; i++) {
            System.out.print("-");
        }
        for (int i = 1; i <= 1; i++) {
            System.out.println("*");
        }

        for (int i = n - 2; i >= 1; i--) {
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - i - 2; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 1; i++) {
            System.out.print("*");
        }
        for (int i = 1; i <= n - 2; i++) {
            System.out.print("-");
        }
        for (int i = 1; i <= 1; i++) {
            System.out.println("*");
        }

        sc.close();
    }
}