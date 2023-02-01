import java.util.Scanner;

public class ID_69_RNA_Quiz_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray();
        int leu = 0;
        int pro = 0;
        int his = 0;
        int gin = 0;
        int arg = 0;
        for (int i = 0; i < arr.length; i += 3) {
            // char[] arrA = new char[3];
            // arr[i] = arrA[0];
            // arr[i+1] = arrA[1];
            // arr[i+2] = arrA[2];
            if (arr[i] == 'C' && arr[i + 1] == 'U' && arr[i + 2] == 'U' ||
                    arr[i] == 'C' && arr[i + 1] == 'U' && arr[i + 2] == 'C' ||
                    arr[i] == 'C' && arr[i + 1] == 'U' && arr[i + 2] == 'A' ||
                    arr[i] == 'C' && arr[i + 1] == 'U' && arr[i + 2] == 'G') {
                leu++;
            }
            if (arr[i] == 'C' && arr[i + 1] == 'C' && arr[i + 2] == 'U' ||
                    arr[i] == 'C' && arr[i + 1] == 'C' && arr[i + 2] == 'C' ||
                    arr[i] == 'C' && arr[i + 1] == 'C' && arr[i + 2] == 'A' ||
                    arr[i] == 'C' && arr[i + 1] == 'C' && arr[i + 2] == 'G') {
                pro++;
            }
            if (arr[i] == 'C' && arr[i + 1] == 'A' && arr[i + 2] == 'U' ||
                    arr[i] == 'C' && arr[i + 1] == 'A' && arr[i + 2] == 'C') {
                his++;
            }
            if (arr[i] == 'C' && arr[i + 1] == 'A' && arr[i + 2] == 'A' ||
                    arr[i] == 'C' && arr[i + 1] == 'A' && arr[i + 2] == 'G') {
                gin++;
            }
            if (arr[i] == 'C' && arr[i + 1] == 'G' && arr[i + 2] == 'U' ||
                    arr[i] == 'C' && arr[i + 1] == 'G' && arr[i + 2] == 'C' ||
                    arr[i] == 'C' && arr[i + 1] == 'G' && arr[i + 2] == 'A' ||
                    arr[i] == 'C' && arr[i + 1] == 'G' && arr[i + 2] == 'G') {
                arg++;
            }

        }
        System.out.print(leu + " " + pro + " " + his + " " + gin + " " + arg);

        sc.close();
    }
}