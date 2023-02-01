import java.util.Scanner;

public class ID_125_Title {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = sc.nextInt();
        int c = a.length();
        if (c <= b) {
            System.out.println(a.substring(0));
        } else {
            System.out.println(a.substring(0, b) + "...");
        }

        sc.close();
    }
}