import java.text.DecimalFormat;
import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        String oddOrEven = "odd";
        boolean printRemainder = operator.equals("+") || operator.equals("-") || operator.equals("*");
        double result = 0;
        DecimalFormat noZero = new DecimalFormat("#.##");

        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            result = (double) num1 / num2;
        } else if (operator.equals("%")) {
            result = (double) num1 % num2;
        }

        if (result % 2 == 0) {
            oddOrEven = "even";
        }

        if (printRemainder) {
            System.out.printf("%d %s %d = " + noZero.format(result) + " - %s", num1, operator, num2, oddOrEven);
        } else {
            if (num2 == 0) {
                System.out.printf("Cannot divide %d by zero", num1);
            } else {
                System.out.printf("%d %s %d = " + noZero.format(result), num1, operator, num2);
            }
        }
    }
}