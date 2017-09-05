import java.util.Scanner;

public class ChristmasHat {
    public static String repeatStr(String str, double count) {
        String output = "";
        for (double i = 0; i < count; i++) {
            output += str;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String top1 = repeatStr(".", 2 * n - 1) + "/|\\" + repeatStr(".", 2 * n - 1);
        String top2 = repeatStr(".", 2 * n - 1) + "\\|/" + repeatStr(".", 2 * n - 1);
        String bottom1 = repeatStr("*", 4 * n + 1);
        String bottom2 = repeatStr("*.", 2 * n) + "*";

        System.out.printf("%s%n%s%n", top1, top2);

        for (int i = 0; i < 2 * n; i++) {
            System.out.println(repeatStr(".", 2 * n - 1 - i) + "*" +
                    repeatStr("-", i) + "*" + repeatStr("-", i) + "*" +
                    repeatStr(".", 2 * n - 1 - i));
        }

        System.out.printf("%s%n%s%n%1$s%n", bottom1, bottom2);
    }
}
