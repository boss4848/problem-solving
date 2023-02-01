import java.util.Scanner;

public class ID_56_Peak_finding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 2];
        for (int i = 1; i < n + 1; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                count++;
            }

        }
        System.out.println(count);
        for (int i = 1; i < n + 1; i++) {
            if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
            // 5 3 2 1 --> 5 0 2 1
        }

        sc.close();
    }
}