import java.util.Scanner;

public class P10_Diamond {
    public static String repeatString (String text, int count) {
        String output = "";
        for (int i = 0; i < count; i++) {
            output += text;
        }
        return output;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < (n / 2) + (n % 2); i++) {
            String hyphensLeftRight = repeatString("-", (n - (i + 1)) / 2);
//            String hyphensMiddle = repeatString("-", (2 * i) - (n % 2));
            System.out.printf("%1$s%2$s%3$s%2$s%1$s%n", hyphensLeftRight, (n % 2 == 0 ? "**": "*"), hyphensMiddle);
        }
        for (int i = 0; i < (n / 2) - 1 + (n % 2); i++) {
            String hyphensLeftRight = repeatString("-", (n - (i + 1)) / 2);
//            String hyphensMiddle = repeatString("-", (2 * i) - (n % 2));
            System.out.printf("%1$s%2$s%3$s%2$s%1$s%n", hyphensLeftRight, (n % 2 == 0 ? "**": "*"), hyphensMiddle);
        }
    }
}
