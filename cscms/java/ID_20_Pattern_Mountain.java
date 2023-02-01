import java.util.Scanner;

public class ID_20_Pattern_Mountain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        int[] baseMountain = new int[n];

        // หาค่าต่างๆ
        int[] s = new int[n];
        int[] star = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            baseMountain[i] = height[i] * 2 - 1;
            s[i] = height[i] - 1;
            star[i] = 1;
        }

        // หา max ใน array
        int max = height[0];
        for (int i = 1; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
            }
        }

        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < n; j++) {
                int d = max - i;
                if (height[j] > d) {
                    // ซ้าย
                    for (int k = 0; k < s[j]; k++) {
                        System.out.print("-");
                    }
                    // *
                    for (int k = 0; k < star[j]; k++) {
                        System.out.print("*");
                    }
                    // ขวา
                    for (int k = 0; k < s[j]; k++) {
                        System.out.print("-");
                    }
                    s[j]--;
                    star[j] += 2;

                } else {
                    // -
                    for (int k = 0; k < baseMountain[j]; k++) {
                        System.out.print("-");
                    }
                }
            }

            System.out.println();
        }
        sc.close();
    }
}