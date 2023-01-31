import java.util.Scanner;

public class ID_5_Prime_Number_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = 0, c = 0;
        b = n / 2;
        if (n == 0 || n == 1) {
            System.out.println("No");
        } else {
            for (int i = 2; i <= b; i++) {
                if (n % i == 0) {
                    System.out.println("No");
                    c = 1;
                    break;
                }
            }
            if (c == 0) {
                System.out.println("Yes");
            }
        }
        sc.close();
    }
}
