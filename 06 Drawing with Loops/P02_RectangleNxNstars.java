import java.util.Scanner;

public class P02_RectangleNxNstars {

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
            System.out.println(repeatStr("*", n));
        }
    }
}


