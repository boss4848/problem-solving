import java.util.Scanner;
import java.util.StringTokenizer;

interface Calculator {
    public double getResult();

    public void clear();

    public void add(double input);

    public void substract(double input);

    public void divide(double input);

    public void multiply(double input);
}

class BasicCalculator implements Calculator {
    private double result;

    BasicCalculator() {

    }

    public double getResult() {
        return result;
    }

    public void clear() {
        result = 0;
    }

    public void add(double input) {
        result += input;
    }

    public void substract(double input) {
        result -= input;
    }

    public void divide(double input) {
        result /= input;
    }

    public void multiply(double input) {
        result *= input;
    }

}

public class ID_64_Calculator_OOP_Quiz_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BasicCalculator cal = new BasicCalculator();
        String expression = sc.nextLine();
        StringTokenizer st = new StringTokenizer(expression);
        int count = 1;
        String operator = "";
        while (st.hasMoreTokens()) {
            // System.out.println(st.nextToken());
            if (count == 1) {
                cal.add(Double.parseDouble(st.nextToken()));
            } else {
                if (count % 2 == 1) {
                    operator = st.nextToken();
                } else {
                    switch (operator) {
                        case "+":
                            cal.add(Double.parseDouble(st.nextToken()));
                            break;
                        case "-":
                            cal.substract(Double.parseDouble(st.nextToken()));
                            break;
                        case "/":
                            cal.divide(Double.parseDouble(st.nextToken()));
                            break;
                        case "*":
                            cal.multiply(Double.parseDouble(st.nextToken()));
                            break;
                    }
                }
            }
            count++;
        }
        System.out.println(cal.getResult());
        sc.close();
    }
}