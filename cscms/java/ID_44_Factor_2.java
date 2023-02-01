import java.util.Scanner;

public class ID_44_Factor_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int count = 0;
            for (int j = 1; j <= Math.sqrt(num); j++) {
                if (num % j == 0 && num / j != Math.sqrt(num)) {
                    count += 2;
                } else if (num % j == 0 && num / j == Math.sqrt(num)) {
                    count++;
                }
            }
            System.out.print(count + " ");
        }

        sc.close();
    }
}