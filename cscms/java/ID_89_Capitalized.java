import java.util.Scanner;

public class ID_89_Capitalized {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(removeLowerCase(word));
        sc.close();

    }

    public static String removeLowerCase(String a) {
        if (a.length() == 0) {
            return "";
        }
        if (a.charAt(0) >= 97) {
            return removeLowerCase(a.substring(1));
        } else {
            return a.charAt(0) + removeLowerCase(a.substring(1));
        }

    }
}