import java.text.DecimalFormat;
import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = Integer.parseInt(scanner.nextLine());

        double p1 = 0.0;
        double p2 = 0.0;
        double p3 = 0.0;
        double p4 = 0.0;
        double p5 = 0.0;

        DecimalFormat df = new DecimalFormat("0.00%");

        for (int i = 0; i < numberCount; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            boolean isP1 = num < 200;
            boolean isP2 = num >= 200 && num < 400;
            boolean isP3 = num >= 400 && num < 600;
            boolean isP4 = num >= 600 && num < 800;
            boolean isP5 = num >= 800;

            if (isP1) {
                p1++;
            }
            if (isP2) {
                p2++;
            }
            if (isP3) {
                p3++;
            }
            if (isP4) {
                p4++;
            }
            if (isP5) {
                p5++;
            }
        }
        p1 = p1 / numberCount;
        p2 = p2 / numberCount;
        p3 = p3 / numberCount;
        p4 = p4 / numberCount;
        p5 = p5 / numberCount;

        System.out.printf("%s%n%s%n%s%n%s%n%s%n", df.format(p1), df.format(p2),
                df.format(p3), df.format(p4), df.format(p5));
    }
}