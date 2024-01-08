public class ID_58_LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon   "));

    }

    public static int lengthOfLastWord(String s) {
        // String newString = s.trim();
        String[] newWords = s.split(" ");

        return newWords[newWords.length - 1].length();
    }
}
