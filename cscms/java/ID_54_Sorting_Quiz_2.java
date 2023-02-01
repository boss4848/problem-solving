import java.util.Arrays;
import java.util.Scanner;

public class ID_54_Sorting_Quiz_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
        Arrays.sort(arr);
        for (int i = 0; i < (arr.length / 2); i++) {
            System.out.print(arr[arr.length - i - 1] + " " + arr[i] + " ");

            if (arr.length / 2 == i + 1 && n % 2 == 1) {
                System.out.print(arr[i + 1]);
            }
        }

        sc.close();
    }
}