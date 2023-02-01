import java.util.Scanner;

public class ID_143_Sentence_Reviews {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        long l = a.length();
        String b = a.replaceAll("-", "");
        char[] arr = b.replaceAll("\\s+", "").toCharArray();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = '\0';
                }

            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z')) {
                sum = arr[i] + sum;
            }

        }
        long power = sum * sum;
        long mod = power % l;
        if (mod > 10 && 0 < mod) {
            System.out.println("ERROR");
        } else {
            System.out.println(mod + "/10");
        }

        sc.close();
    }
}