import java.util.Scanner;

public class ID_48_Finite_State_Machine_Quiz_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String d = sc.next();

        if (a.equals("0") && b.equals("0") && c.equals("-") && d.equals("-") ||
                a.equals("0") && b.equals("1") && c.equals("-") && d.equals("1") ||
                a.equals("1") && b.equals("0") && c.equals("1") && d.equals("-")) {
            System.out.println("NEUTRAL");
        }
        if (a.equals("0") && b.equals("0") && c.equals("1") && d.equals("-") ||
                a.equals("1") && b.equals("0") && c.equals("-") && d.equals("-") ||
                a.equals("0") && b.equals("1") && c.equals("1") && d.equals("-")) {
            System.out.println("MuR");
        }
        if (a.equals("0") && b.equals("0") && c.equals("-") && d.equals("1") ||
                a.equals("1") && b.equals("0") && c.equals("-") && d.equals("1") ||
                a.equals("0") && b.equals("1") && c.equals("-") && d.equals("-")) {
            System.out.println("DnD");
        }

        sc.close();
    }
}