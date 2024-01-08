public class ID_9_PalindromeNumber {
    public static void main(String[] args) {
        int x = 123454321;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        String str_x = Integer.toString(x);
        char[] leftToRight = str_x.toCharArray();
        int checkPalindrome = 0;
        for (int i = 0; i < str_x.length(); i++) {
            if (str_x.charAt(i) == leftToRight[(str_x.length() - 1) - i]) {
                checkPalindrome++;
            }
        }
        if (checkPalindrome == str_x.length()) {
            return true;
        }
        return false;
    }
}
