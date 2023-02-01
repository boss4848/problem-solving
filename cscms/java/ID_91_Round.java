import java.util.Scanner;

public class ID_91_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        if (Math.round(a) % 10 == 7 || Math.round(a) % 7 == 0) {
            System.out.println("Unlucky");
        } else {
            System.out.println("Lucky");
        }
        sc.close();
    }
}