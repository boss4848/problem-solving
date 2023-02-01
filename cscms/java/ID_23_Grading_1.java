import java.util.Scanner;

public class ID_23_Grading_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n >= 90 && n <= 100) {
            System.out.println("A");
        } else if (n >= 80 && n <= 89) {
            System.out.println("B");
        } else if (n >= 60 && n <= 79) {
            System.out.println("C");
        } else if (n >= 50 && n <= 59) {
            System.out.println("D");
        } else if (n >= 0 && n <= 49) {
            System.out.println("F");
        }
        scan.close();
    }
}