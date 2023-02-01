import java.util.Scanner;

public class ID_57_Partial_Sum_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = 0;
            for (int j = a; j <= b; j++) {
                sum += arr[j];
            }
            System.out.println(sum);
        }

        sc.close();
    }
}