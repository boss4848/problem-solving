import java.util.Scanner;

public class ID_75_Rock_Paper_Scissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mr = sc.next().toLowerCase();
        String dr = sc.next().toLowerCase();
        // System.out.println(mr);
        // System.out.println(dr);
        if (mr.equals("rock")) {
            if (dr.equals("paper")) {
                System.out.println("Dr.Worarat Krathu");
            }
            if (dr.equals("scissors")) {
                System.out.println("Mr.Ukrit Ruckcharti");
            }
        }
        if (mr.equals("paper")) {
            if (dr.equals("scissors")) {
                System.out.println("Dr.Worarat Krathu");
            }
            if (dr.equals("rock")) {
                System.out.println("Mr.Ukrit Ruckcharti");
            }
        }
        if (mr.equals("scissors")) {
            if (dr.equals("rock")) {
                System.out.println("Dr.Worarat Krathu");
            }
            if (dr.equals("paper")) {
                System.out.println("Mr.Ukrit Ruckcharti");
            }
        }
        if (mr.equals(dr)) {
            System.out.println("Draw");
        }

        sc.close();
    }
}