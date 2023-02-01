import java.util.Scanner;

public class ID_140_Hello_CS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                String b = sc.next();
                StringBuilder s = new StringBuilder(b);
                s.reverse();
                System.out.print(s + " ");
            } else {
                String a = sc.next();
                System.out.print(a + " ");
            }
        }

        sc.close();
    }
}