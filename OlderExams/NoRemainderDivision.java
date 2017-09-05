import java.text.DecimalFormat;
import java.util.Scanner;

public class NoRemainderDivision {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = Integer.parseInt(scanner.nextLine());
        double p1 = 0.0;
        double p2 = 0.0;
        double p3 = 0.0;
        DecimalFormat df = new DecimalFormat("0.00%");

        for (int i = 0; i < numberCount; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            boolean isP1 = num % 2 == 0;
            boolean isP2 = num % 3 == 0;
            boolean isP3 = num % 4 == 0;

            if (isP1) {
                p1++;
            }
            if (isP2) {
                p2++;
            }
            if (isP3) {
                p3++;
            }
        }

        p1 /= numberCount;
        p2 /= numberCount;
        p3 /= numberCount;
        System.out.printf("%s%n%s%n%s%n", df.format(p1), df.format(p2), df.format(p3));
    }
}
