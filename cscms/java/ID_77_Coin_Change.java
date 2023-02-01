import java.util.Scanner;

public class ID_77_Coin_Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("Not enough money.");
        } else if (a == b) {
            System.out.println("No change for you.");
        } else {
            int change = b - a;
            System.out.println("Change: " + change);
            int thb1000 = change / 1000;
            if (thb1000 > 0) {
                change %= 1000;
            }
            System.out.println("1000THB: " + (thb1000));
            int thb500 = change / 500;
            if (thb500 > 0) {
                change %= 500;
            }
            System.out.println("500THB: " + (thb500));
            int thb100 = change / 100;
            if (thb100 > 0) {
                change %= 100;
            }
            System.out.println("100THB: " + (thb100));
            int thb50 = change / 50;
            if (thb50 > 0) {
                change %= 50;
            }
            System.out.println("50THB: " + (thb50));
            int thb20 = change / 20;
            if (thb20 > 0) {
                change %= 20;
            }
            System.out.println("20THB: " + (thb20));
            int thb10 = change / 10;
            if (thb10 > 0) {
                change %= 10;
            }
            System.out.println("10THB: " + (thb10));
            int thb5 = change / 5;
            if (thb5 > 0) {
                change %= 5;
            }
            System.out.println("5THB: " + (thb5));
            int thb2 = change / 2;
            if (thb2 > 0) {
                change %= 2;
            }
            System.out.println("2THB: " + (thb2));
            int thb1 = change / 1;
            if (thb1 > 0) {
                change %= 1;
            }
            System.out.println("1THB: " + (thb1));
        }

        sc.close();
    }
}