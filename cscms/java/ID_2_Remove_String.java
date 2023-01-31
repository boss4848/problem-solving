import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str_1 = sc.nextLine();
        String str_2 = sc.nextLine();
        String result = "";

        if (str_1.length() > str_2.length()) {
            result = str_1.replaceAll(str_2, "");
        } else {
            result = str_2.replaceAll(str_1, "");
        }
        System.out.println(result);
        sc.close();
    }
}