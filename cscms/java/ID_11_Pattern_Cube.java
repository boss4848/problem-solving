import java.util.Scanner;

public class ID_11_Pattern_Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n - 1; i++) {
            System.out.print("-");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();

        // i 3 j 3->1
        // i 2 j 2
        // i 1 j 1
        for (int i = n - 2; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int j = n - 2; j >= 1; j--) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int j = 1; j >= i - n + 4; j--) {
                System.out.print("-");
            }
            System.out.println("*");
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        for (int i = 1; i < n - 1; i++) {
            System.out.print("-");
        }
        System.out.println("*");

        for (int i = n - 2; i >= 1; i--) {
            System.out.print("*");
            for (int j = n - 2; j >= 1; j--) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int j = i - 1; j >= 1; j--) {
                System.out.print("-");
            }
            System.out.println("*");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        sc.close();
    }
}
