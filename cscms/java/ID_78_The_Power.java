import java.util.Scanner;

public class ID_78_The_Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long power = 1;
        for (int i = 1; i <= b; i++) {
            for (int j = a; j <= a; j++) {
                power = j * power;
            }
        }
        System.out.println(power);

        sc.close();
    }
}