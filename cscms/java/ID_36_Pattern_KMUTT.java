import java.util.Scanner;

public class ID_36_Pattern_KMUTT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int j = 1; j <= n * 2; j++) {
                System.out.print("-");
            }
            System.out.println();
        }

        for (int i = 1; i <= n * 2 + 1; i++) {
            System.out.print("*");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int j = 1; j <= n - 1; j++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int j = 1; j <= n; j++) {
                System.out.print("-");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("-");
        }
        for (int i = 1; i <= n * 2 + 1; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n * 2; j++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int j = 1; j <= n; j++) {
                System.out.print("-");
            }
            System.out.println();
        }

        sc.close();
    }
}