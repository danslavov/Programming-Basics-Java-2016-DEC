import java.util.Scanner;

public class Axe {
    public static String repeatStr(String text, int count) {
        String output = "";
        for (int i = 0; i < count; i++) {
            output += text;
        }
        return output;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean nIsEven = n % 2 == 0;

        String hyphensLeft = repeatStr("-", 3 * n);
        String helve = repeatStr("*", 3 * n);

        String last = repeatStr("-", (3 * n) - (n / 2 - 1)) +
                repeatStr("*", nIsEven ? (2 * n - 1) : (2 * n - 2)) +
                repeatStr("-", nIsEven ? (n / 2) : (n / 2 + 1));


        for (int i = 0; i < n; i++) {
            System.out.println(hyphensLeft + "*" + repeatStr("-", i) +
                    "*" + repeatStr("-", 2 * n - 2 - i));
        }
        for (int i = 0; i < n / 2; i++) {
            System.out.println(helve + "*" + repeatStr("-", n - 1) +
                    "*" + repeatStr("-", n - 1));
        }
        for (int i = 0; i < n / 2 - 1; i++) {
            System.out.println(repeatStr("-", 3 * n - i) + "*" +
                    repeatStr("-", n - 1 + 2 * i) + "*" +
                    repeatStr("-", n - 1 - i));
        }
        System.out.println(last);
    }
}