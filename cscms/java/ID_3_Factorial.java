import java.util.Scanner;

class ID_3_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 1;
        for (int i = n; i >= 1; i--) {
            result = result * i;
        }
        System.out.println(result);
        sc.close();
    }
}