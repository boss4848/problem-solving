import java.util.Scanner;

public class ID_22_Sum_of_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().toLowerCase();
        char[] arr = name.toCharArray();
        int sum = 0;
        for (int k = 0; k < arr.length; k++) {
            for (int i = 'a', j = 1; i <= 'z'; i++, j++) {
                if (arr[k] == i) {
                    sum = j + sum - k;
                    // System.out.println(j);
                }
            }

        }
        System.out.print(sum);
        sc.close();
    }

}
