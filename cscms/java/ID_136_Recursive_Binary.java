import java.util.Scanner;

public class ID_136_Recursive_Binary {
    public static String binary(int a) {
        // 10--> 10/2 5/2 2/2 1/2
        // 0 1 0 1->1010
        if (a == 0 || a == 1) {
            return "" + a % 2;
        } else {
            return binary(a / 2) + "" + a % 2;
        }
        // --> -1010
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String ans = binary(a);
        System.out.println(ans);
        sc.close();
    }

}