import java.util.Scanner;

public class ID_82_Morse_code_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String morse = sc.nextLine();
        String[] arr = morse.split(" ");
        for (int i = 0; i < arr.length; i++) {
            // System.out.print(i);
            if (arr[i].equals(".-")) {
                System.out.print("A");
            }
            if (arr[i].equals("-...")) {
                System.out.print("B");
            }
            if (arr[i].equals("-.-.")) {
                System.out.print("C");
            }
            if (arr[i].equals("-..")) {
                System.out.print("D");
            }
            if (arr[i].equals(".")) {
                System.out.print("E");
            }
            if (arr[i].equals("..-.")) {
                System.out.print("F");
            }
            if (arr[i].equals("--.")) {
                System.out.print("G");
            }
            if (arr[i].equals("....")) {
                System.out.print("H");
            }
            if (arr[i].equals("..")) {
                System.out.print("I");
            }
            if (arr[i].equals(".---")) {
                System.out.print("J");
            }
            if (arr[i].equals("-.-")) {
                System.out.print("K");
            }
            if (arr[i].equals(".-..")) {
                System.out.print("L");
            }
            if (arr[i].equals("--")) {
                System.out.print("M");
            }
            if (arr[i].equals("-.")) {
                System.out.print("N");
            }
            if (arr[i].equals("---")) {
                System.out.print("O");
            }
            if (arr[i].equals(".--.")) {
                System.out.print("P");
            }
            if (arr[i].equals("--.-")) {
                System.out.print("Q");
            }
            if (arr[i].equals(".-.")) {
                System.out.print("R");
            }
            if (arr[i].equals("...")) {
                System.out.print("S");
            }
            if (arr[i].equals("-")) {
                System.out.print("T");
            }
            if (arr[i].equals("..-")) {
                System.out.print("U");
            }
            if (arr[i].equals("...-")) {
                System.out.print("V");
            }
            if (arr[i].equals(".--")) {
                System.out.print("W");
            }
            if (arr[i].equals("-..-")) {
                System.out.print("X");
            }
            if (arr[i].equals("-.--")) {
                System.out.print("Y");
            }
            if (arr[i].equals("--..")) {
                System.out.print("Z");
            }
        }

        sc.close();
    }
}