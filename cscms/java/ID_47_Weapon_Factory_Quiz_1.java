import java.util.Scanner;

public class ID_47_Weapon_Factory_Quiz_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sword = 0;
        int shield = 0;
        int helmet = 0;
        int remaining = 0;
        for (int i = n; i > 0; i--) {
            if (n >= 10) {
                n -= 10;
                sword += 1;
            }
            if (n >= 8) {
                n -= 8;
                shield += 1;
            }
            if (n >= 3) {
                n -= 3;
                helmet += 1;
            }

        }
        remaining = n;
        System.out.println(sword + " " + shield + " " + helmet + " " + remaining);

        sc.close();
    }
}