import java.util.Scanner;

public class P08_Sunglasses {
    public static String repeatStr (String text, int count) {
        String output = "";
        for (int i = 0; i < count; i++) {
            output += text;
        }
        return output;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String firstLastLine = repeatStr("*", 2 * n) +
        repeatStr(" ", n) + repeatStr("*", 2 * n);
        String middleLeftRightLine = "*" + repeatStr("/", 2 * n - 2) + "*";
        System.out.println(firstLastLine);
        for (int i = 0; i < n - 2; i++) {
            System.out.print(middleLeftRightLine);
            if (i == ((n - 1) / 2) - 1) {
                System.out.print(repeatStr("|", n));
            } else {
                System.out.print(repeatStr(" ", n));
            }
            System.out.println(middleLeftRightLine);
        }
        System.out.println(firstLastLine);
    }
}
