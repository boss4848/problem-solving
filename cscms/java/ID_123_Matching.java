import java.util.Scanner;

public class ID_123_Matching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if (a.equals(b)) {
            System.out.print("Perfect Match");
        } else if (a.equalsIgnoreCase(b)) {
            System.out.print("Partial Match");
        } else if (a.toLowerCase().contains(b.toLowerCase())) {
            System.out.print("Partial Match");
        } else if (b.toLowerCase().contains(a.toLowerCase())) {
            System.out.print("Partial Match");
        } else {
            System.out.println("Not Match");
        }

        sc.close();
    }
}