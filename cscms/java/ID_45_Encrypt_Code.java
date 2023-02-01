import java.util.Scanner;

public class ID_45_Encrypt_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] arr = a.toLowerCase().toCharArray();
        int[] count = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count[i] = arr[j];
                    count[j] = arr[i];
                }

            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == count[i]) {
                System.out.print("-");
            } else {
                System.out.print('*');
            }
        }

        sc.close();
    }
}