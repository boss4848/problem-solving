import java.util.Scanner;

public class ID_147_Fruit_Picker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int days = sc.nextInt();
        int indexI = 0;
        int indexj = 0;
        int sum = 0;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // System.out.println();
        for (int i = 0; i < days; i++) {
            int max = 0;
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    if (max < arr[j][k]) {
                        max = arr[j][k];
                        indexI = j;
                        indexj = k;
                    }
                    if (arr[j][k] != 0) {
                        arr[j][k] -= 1;
                    }
                    // System.out.print(arr[j][k]+" ");
                }
                // System.out.println();
            }
            sum += max;
            // System.out.println(indexI+" "+indexj);
            arr[indexI][indexj] = 0;
            // System.out.println(i+" "+max);
        }
        System.out.println(sum);

        sc.close();
    }
}