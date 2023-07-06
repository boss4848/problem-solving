import java.util.Scanner;

public class ID_145_Overlapped_Circle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int r1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int r2 = sc.nextInt();

        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double sumRadius = r1 + r2;
        if (sumRadius > distance) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}