import java.util.Scanner;

public class Fox {
    public static String repeatStr(String character, int count) {
        String output = "";
        for (int i = 0; i < count; i++) {
            output += character;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println(repeatStr("*", i) + "\\"
                    + repeatStr("-", 2 * n - 2 * i + 1) + "/"
                    + repeatStr("*", i));
        }

        for (int j = 1; j <= n / 3; j++) {
            for (int i = 1; i <= 2 * n + 3; i++) {
                if (i == 1 || i == 2 * n + 3) {
                    System.out.print("|");
                } else if (i == n / 2 + 1 + j) {
                    System.out.print("\\");
                } else if (i == (2 * n + 3) - (n / 2 + j)) {
                    System.out.print("/");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();

        }

        for (int i = 1; i <= n; i++) {
            System.out.println(repeatStr("-", i) + "\\"
                    + repeatStr("*", 2 * n - 2 * i + 1) + "/"
                    + repeatStr("-", i));

        }
    }
}