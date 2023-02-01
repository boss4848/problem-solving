import java.util.Scanner;

public class ID_73_Hello_Do_or_Die {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String surname = sc.next();
        System.out.println("Hello, " + name + " " + surname + ".");
        System.out.println("Welcome to Do or Die exam.");

        sc.close();
    }
}