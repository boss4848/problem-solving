import java.util.Scanner;

public class ID_8_Pattern_Rectangle_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("-");
        for (int i = n - 2; i >= 1; i--) {
            System.out.print("*");
        }
        System.out.println("-");
        for (int i = 1; i <= n - 2; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("-");
        for (int i = n - 2; i >= 1; i--) {
            System.out.print("*");
        }
        System.out.println("-");
        sc.close();
    }
}
