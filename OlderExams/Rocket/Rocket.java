import java.util.Scanner;

public class Rocket {
    static String repString(String input, double count) {
        String output = "";
        for (double i = 0; i < count; i++) {
            output += input;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println(repString(".", 1.5 * n - i - 1) +
                    "/" + repString(" ", 2 * i) + "\\" +
                    repString(".", 1.5 * n - i - 1));
        }

        System.out.println(repString(".", n / 2) +
                repString("*", 2 * n) + repString(".", n / 2));

        for (int i = 0; i < 2 * n; i++) {
            System.out.println(repString(".", n / 2) + "|" +
                    repString("\\", 2 * n - 2) + "|" +
                    repString(".", n / 2));
        }

        for (int i = 0; i < n / 2; i++) {
            System.out.println(repString(".", n / 2 - i) + "/" +
            repString("*", (2 * n - 2) + (2 * i)) + "\\" +
                    repString(".", n / 2 - i));
        }
    }
}