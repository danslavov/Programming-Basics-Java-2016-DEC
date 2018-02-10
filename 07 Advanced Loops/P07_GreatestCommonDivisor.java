import java.util.Scanner;

public class P07_GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int dividend = Math.max(num1, num2);
        int divider = Math.min(num1, num2);
        int remainder = dividend % divider;
        int gcd = divider;

        while (remainder != 0) {
            remainder = dividend % divider;
            gcd = divider;
            dividend = divider;
            divider = remainder;
        }

        System.out.println(gcd);
    }
}
