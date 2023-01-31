import java.util.Scanner;

public class ID_10_Pattern_Rectangle_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = n - 2; i >= 1; i--) {
            System.out.print("*");
            for (int j = 1; j <= a - 2; j++) {
                System.out.print("-");
            }
            System.out.println("*");
        }
        for (int i = 1; i <= a; i++) {
            System.out.print("*");
        }
        sc.close();
    }
}
