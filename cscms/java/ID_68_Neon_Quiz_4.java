import java.util.Scanner;

public class ID_68_Neon_Quiz_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
            if (max < arr[i].length()) {
                max = arr[i].length();
            }
        }
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < n; j++) {
                if (i < arr[j].length()) {
                    System.out.print(arr[j].charAt(i) + " ");
                }

                else {
                    System.out.print("  ");
                }
                // System.out.print(j+" "+i);
            }
            System.out.println();
        }

        sc.close();
    }
}