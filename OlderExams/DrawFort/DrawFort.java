import java.util.Scanner;

public class DrawFort {
    public static String repeatStr(String str, int count) {
        String output = "";
        for (int i = 0; i < count; i++) {
            output += str;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String firstRow = "/" + repeatStr("^", n / 2) + "\\" +
                repeatStr("_", 2 * n - 2 * (n / 2) - 4) + "/" +
                repeatStr("^", n e/ 2) + "\\";
        String middleRow = "|" + repeatStr(" ", 2 * n - 2) + "|";
        String nextToLastRow = "|" + repeatStr(" ", n / 2 + 1) +
                repeatStr("_", 2 * n - 2 * (n / 2) - 4) +
                repeatStr(" ", n / 2 + 1) + "|";
        String lastRow = "\\" + repeatStr("_", n / 2) + "/" +
                repeatStr(" ", 2 * n - 2 * (n / 2) - 4) + "\\" +
                repeatStr("_", n / 2) + "/";

        System.out.println(firstRow);

        if (n > 4) {
            for (int i = 0; i < n - 3; i++) {
                System.out.println(middleRow);
            }
            System.out.println(nextToLastRow);
            System.out.println(lastRow);
        } else {
            for (int i = 0; i < n - 2; i++) {
                System.out.println(middleRow);
            }
            System.out.println(lastRow);
        }
    }
}
