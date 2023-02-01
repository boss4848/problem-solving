import java.util.Scanner;

public class ID_61_Cut_String_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        char[] arr = a.toLowerCase().toCharArray();
        int count = 0;
        int c = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = c; j < i; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    c = i;
                    break;
                }
            }
        }
        System.out.println(count + 1);

        sc.close();
    }
}