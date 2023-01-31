import java.util.Scanner;

public class ID_9_Train_Bomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 3 && b == 2 || a == 2 && b == 1 || a == 1 && b == 1) {
            System.out.print("DIE");

        }

        else {
            for (int i = 1; i <= a; i++) {
                if (i == b || i == b - 1 || i == b + 1) {

                } else {
                    System.out.print(i + " ");
                }

            }
        }
        sc.close();
    }
}
