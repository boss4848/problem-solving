import java.util.Scanner;

public class ID_52_Text_Inside_out {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        // 01234567
        // 32107654

        // 01234
        // 10354

        // 01234 5 678910
        // 43210 5 109876
        char[] arr = n.toCharArray();
        if (n.length() % 2 == 0) {
            for (int i = n.length() / 2 - 1; i >= 0; i--) {
                System.out.print(arr[i]);
            }
            for (int i = n.length() - 1; i >= n.length() / 2; i--) {
                System.out.print(arr[i]);
            }
        }
        if (n.length() % 2 == 1) {
            for (int i = n.length() / 2 - 1; i >= 0; i--) {
                System.out.print(arr[i]);
            }
            System.out.print(arr[n.length() / 2]);
            for (int i = n.length() - 1; i > n.length() / 2; i--) {
                System.out.print(arr[i]);
            }
        }

        sc.close();
    }
}