import java.util.Scanner;

public class ID_49_Isogram_Quiz_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String c = a.toLowerCase();
        String b = c.replaceAll("-", "");
        char[] arr = b.replaceAll("\\s+", "").toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
        }
        if (count > 0) {
            System.out.println(a + " is not an isogram");
        } else {
            System.out.println(a + " is an isogram");
        }

        sc.close();
    }
}