import java.util.Scanner;

public class P10_RectangleWithStars {

    public static String repeatString(String text, int count) {
        String output = "";
        for (int i = 0; i < count; i++) {
            output += text;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String firstLast = repeatString("%", 2 * n);
        String spaces = repeatString(" ", 2 * n - 2);

        System.out.println(firstLast);

        if (n % 2 != 0) {

            for (int i = 0; i < n; i++) {
                if (i != n / 2) {
                    System.out.println("%" + repeatString(" ", 2 * n - 2) + "%");
                } else {
                    System.out.println("%" + repeatString(" ", n - 2) + "**" + repeatString(" ", n - 2) + "%");
                }
            }

        } else {

            for (int i = 0; i < n - 1; i++) {
                if (i != n / 2 - 1) {
                    System.out.println("%" + repeatString(" ", 2 * n - 2) + "%");
                } else {
                    System.out.println("%" + repeatString(" ", n - 2) + "**" + repeatString(" ", n - 2) + "%");
                }
            }
        }
        System.out.println(firstLast);
    }
}