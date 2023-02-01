import java.util.Scanner;

public class ID_29_Every_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int a = sc.nextInt();
        char[] arr = n.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i % a == 0) {
                System.out.print(arr[i]);
            }
        }
        sc.close();
    }
}