import java.util.Scanner;

public class ID_21_Pattern_Triangle_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i - 2; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        sc.close();
    }
}
