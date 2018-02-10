import java.util.Scanner;

public class P06_RhombusOfStars {
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

        for (int i = 0; i < n - 1; i++) {
            System.out.println(repeatStr(" ", n - 2 - i)
                    + repeatStr(" *", i + 1));
        }
        System.out.println("*" + repeatStr(" *", n - 1));

        for (int i = n; i > 0; i--) {
            System.out.println(repeatStr(" ", n - i)
                    + repeatStr(" *", i - 1));
        }
    }
}
