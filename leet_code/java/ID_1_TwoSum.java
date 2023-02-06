package leet_code.java;

import java.util.Scanner;

public class ID_1_TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numsStr = sc.next();
        int target = sc.nextInt();
        String[] numsStrArr = numsStr.substring(1, numsStr.length() - 1).split(",");
        int[] nums = new int[numsStrArr.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(numsStrArr[i]);
        }

        // for (int i = 1; i < nums.length; i++) {
        // for (int j = 0; j < nums.length - 1; j++) {
        // if (j + i < nums.length && nums[j] + nums[j + i] == target) {
        // System.out.print(j + "" + (j + i) + " ");
        // }

        // }
        // System.out.println();
        // }
        System.out.println(twoSum(nums, target)[0] + "," + twoSum(nums, target)[1]);

        sc.close();
    }

    public static int[] twoSum(int[] nums, int target) {
        // print เลขตัวนี้ให้ได้ก่อน
        // 0 1 1 2 2 3
        // 0 2 1 3
        // 0 3

        // 0 1 2
        // 1 2 3
        // 0 1
        // 2 3
        // 0
        // 3

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (j + i < nums.length && nums[j] + nums[j + i] == target) {
                    return new int[] { j, j + i };
                }
            }
        }
        return new int[2];
    }
}
