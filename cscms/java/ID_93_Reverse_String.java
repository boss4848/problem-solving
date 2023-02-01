import java.util.Scanner;

public class ID_93_Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                if (j == arr[i].length() - 1) {
                    System.out.print(arr[i].toUpperCase().charAt(j));
                } else {
                    System.out.print(arr[i].toLowerCase().charAt(j));
                }
            }
            System.out.print(" ");
        }

        sc.close();
    }
}