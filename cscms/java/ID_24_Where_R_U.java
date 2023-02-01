import java.util.Scanner;

public class ID_24_Where_R_U {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String d = sc.next();
        char c = d.charAt(0);
        char arr[] = a.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (c == arr[i]) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("ERROR");
        } else {
            System.out.println(count);
            count -= 1;
            for (int i = 0; i < arr.length; i++) {
                if (c == arr[i]) {
                    System.out.print(i);
                    if (count > 0) {
                        System.out.print(", ");
                    }
                    count -= 1;
                }
            }
        }
        sc.close();

    }
}