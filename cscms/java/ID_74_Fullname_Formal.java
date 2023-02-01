import java.util.Scanner;

public class ID_74_Fullname_Formal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String f = sc.next();
        String l = sc.next();

        System.out.print(f.substring(0, 1).toUpperCase() + f.substring(1).toLowerCase());
        System.out.print(" ");
        System.out.print(l.substring(0, 1).toUpperCase() + l.substring(1).toLowerCase());

        sc.close();
    }
}