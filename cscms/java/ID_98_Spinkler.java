import java.util.Scanner;

public class ID_98_Spinkler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        String[] arr = new String[row];
        int[][] water = new int[row][col];
        for (int i = 0; i < row; i++) {
            arr[i] = sc.next();
        }
        // 00 01 02 03
        // 10 11 12 13
        // 20 21 22 23
        // 30 31 32 33
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (arr[i].charAt(j) == 'S') {
                    water[i][j]++;
                    // right
                    for (int k = j + 1; k < col; k++) {
                        if (arr[i].charAt(k) == 'X') {
                            break;
                        }
                        water[i][k]++;

                    }
                    // left
                    for (int k = j - 1; k >= 0; k--) {
                        if (arr[i].charAt(k) == 'X') {
                            break;
                        }
                        water[i][k]++;

                    }
                    // up
                    for (int k = i - 1; k >= 0; k--) {
                        if (arr[k].charAt(j) == 'X') {
                            break;
                        }
                        water[k][j]++;

                    }
                    // down
                    for (int k = i + 1; k < row; k++) {
                        if (arr[k].charAt(j) == 'X') {
                            break;
                        }
                        water[k][j]++;

                    }
                }

            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(water[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}