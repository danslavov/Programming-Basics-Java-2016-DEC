import java.util.Scanner;

public class P05_SquareFrame {

    public static String repeatStr(String text, int count) {
        String output = "";
        for (int i = 0; i < count; i++) {
            output += text;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if ((i == 0) || (i == n - 1)) {
                System.out.print("+ ");
                System.out.print(repeatStr("- ", n - 2));
                System.out.println("+");
            } else {
                System.out.print("| ");
                System.out.print(repeatStr("- ", n - 2));
                System.out.println("|");
            }
        }
    }
}
