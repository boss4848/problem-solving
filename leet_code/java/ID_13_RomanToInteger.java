public class ID_13_RomanToInteger {
    public static void main(String[] args) {
        // String s = "MCMXCIV";
        String s = "III";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int[] nums = new int[s.length()];
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'M') {
                nums[i] = 1000;
            } else if (s.charAt(i) == 'D') {
                nums[i] = 500;
            } else if (s.charAt(i) == 'C') {
                nums[i] = 100;
            } else if (s.charAt(i) == 'L') {
                nums[i] = 50;
            } else if (s.charAt(i) == 'X') {
                nums[i] = 10;
            } else if (s.charAt(i) == 'V') {
                nums[i] = 5;
            } else if (s.charAt(i) == 'I') {
                nums[i] = 1;
            }
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                sum += (nums[i] - nums[i - 1]);

                nums[i] = 0;
                nums[i - 1] = 0;
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
        }
        return sum;

    }
}
