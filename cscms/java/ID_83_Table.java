import java.util.Scanner;

public class ID_83_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b > 0) {
            System.out.print("*");
        }
        for (int i = 1; i <= b; i++) {
            System.out.print("_*");
        }
        System.out.println();
        for (int i = 1; i <= a; i++) {
            System.out.print("|");
            for (int j = 1; j <= b; j++) {
                System.out.print("_|");
            }
            System.out.println();
        }

        sc.close();
    }
}