import java.util.Scanner;

public class ID_67_Mario_Quiz_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 15 == 0) {
                if (i % 15 == 0) {
                    int bonus15 = 0;
                    bonus15 = i * 10;
                    sum = bonus15 + sum;
                    // System.out.println("15 = "+i+"bonus ="+bonus15);
                } else if (i % 5 == 0) {
                    int bonus5 = 0;
                    bonus5 = i * 3;
                    sum = bonus5 + sum;
                    // System.out.println("5 = "+i+"bonus ="+bonus5);
                } else if (i % 3 == 0) {
                    int bonus3 = 0;
                    bonus3 = i * 2;
                    sum = bonus3 + sum;
                    // System.out.println("3 = "+i+"bonus ="+bonus3);
                }
            } else {
                sum = i + sum;
                // System.out.println(i);
            }
        }
        System.out.println(sum);

        sc.close();
    }
}