import java.util.Scanner;

public class ID_28_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        int c = sc.nextInt();
        long r = 0;
        if (b.equals("+")) {

            r = a + c;
            System.out.println(r);
        } else if (b.equals("-")) {
            r = a - c;
            System.out.println(r);
        } else if (b.equals("*")) {
            r = a * c;
            System.out.println(r);
        } else if (b.equals("/")) {
            if (c == 0) {
                System.out.println("error");
            } else {
                r = a / c;
                System.out.println(r);
            }
        } else if (b.equals("%")) {
            if (c == 0) {
                System.out.println("error");
            } else {
                r = a % c;
                System.out.println(r);
            }
        } else {
            System.out.println("error");
        }
        sc.close();
    }
}