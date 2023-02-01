import java.util.Scanner;

public class ID_137_Recursive_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numString(n));
        sc.close();
    }

    public static String numString(int n) {
        if (n == 1) {
            return n + "";
        } else {
            return numText(n, n) + "" + numString(n - 1) + numText(n, n);
        }
    }

    // 4444 333 333 4444
    public static String numText(int a, int b) {
        if (b == 1) {
            return a + "";
        } else {
            return a + "" + numText(a, b - 1);
        }
    }
}