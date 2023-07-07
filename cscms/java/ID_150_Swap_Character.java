import java.util.Scanner;

public class ID_150_Swap_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        char[] charStr = str.toCharArray();

        for (int i = 0; i < n; i++) {
            int swapI = sc.nextInt();
            int swapJ = sc.nextInt();
            if (swapI < str.length() && swapI >= 0 && swapJ < str.length() && swapJ >= 0) {
                char temp;
                temp = charStr[swapI];
                charStr[swapI] = charStr[swapJ];
                charStr[swapJ] = temp;
            }
        }
        System.out.print(charStr);
        sc.close();
    }
}
