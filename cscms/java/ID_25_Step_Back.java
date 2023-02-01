import java.util.Scanner;

public class ID_25_Step_Back {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i >= b; i--) {
            for (int j = a; j >= i; j--) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}