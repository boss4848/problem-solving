import java.util.Scanner;

public class ID_144_Word_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();
        String star = a.replaceAll(b, "*");
        int count = 0;
        char[] word = star.toCharArray();
        for (int i = 0; i < word.length; i++) {
            if (word[i] == '*') {
                count++;
            }
        }
        System.out.println(count);

        sc.close();
    }
}