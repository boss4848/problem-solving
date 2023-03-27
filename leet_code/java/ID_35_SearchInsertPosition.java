package leet_code.java;

public class ID_35_SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 3, 5, 6 };
        // int[] nums = new int[] {};
        System.out.println(searchInsert(nums, 2));
    }

    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            } else if (nums[i] < target) {
                System.out.println("target: " + target);
                System.out.println("index: " + index);
                index++;
            }
        }
        return index;
    }
}
