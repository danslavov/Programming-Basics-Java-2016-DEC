import java.util.Scanner;

public class P10_CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean prime = true;
        int divider = 2;

        if (n > 1) {
            while (divider <= Math.sqrt(n)) {
                if (n % divider == 0) {
                    prime = false;
                    break;
                }
                divider++;
            }

        } else {
            prime = false;
        }

        if (prime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
