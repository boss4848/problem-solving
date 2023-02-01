import java.util.Scanner;

public class ID_76_Morse_code {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine()
                .toLowerCase()
                .replaceAll(" ", "/ ")
                .replaceAll("a", ".- ")
                .replaceAll("b", "-... ")
                .replaceAll("c", "-.-. ")
                .replaceAll("d", "-.. ")
                .replaceAll("e", ". ")
                .replaceAll("f", "..-. ")
                .replaceAll("g", "--. ")
                .replaceAll("h", ".... ")
                .replaceAll("i", ".. ")
                .replaceAll("j", ".--- ")
                .replaceAll("k", "-.- ")
                .replaceAll("l", ".-.. ")
                .replaceAll("m", "-- ")
                .replaceAll("n", "-. ")
                .replaceAll("o", "--- ")
                .replaceAll("p", ".--. ")
                .replaceAll("q", "--.- ")
                .replaceAll("r", ".-. ")
                .replaceAll("s", "... ")
                .replaceAll("t", "- ")
                .replaceAll("u", "..- ")
                .replaceAll("v", "...- ")
                .replaceAll("w", ".-- ")
                .replaceAll("x", "-..- ")
                .replaceAll("y", "-.-- ")
                .replaceAll("z", "--.. ");

        System.out.println(a);

        sc.close();
    }
}