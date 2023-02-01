import java.util.Scanner;

public class ID_111_Search_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();

        if (a.startsWith(b) && a.endsWith(b)) {
            System.out.print("Front,Back");
        } else if (a.startsWith(b)) {
            System.out.print("Front");
        } else if (a.endsWith(b)) {
            System.out.print("Back");
        } else {
            System.out.print("No");
        }

        sc.close();
    }
}