import java.util.Scanner;

public class P09_House {
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

        int hyphensFormula = (n - 1) / 2;
        int starsFormula = n - 2 * hyphensFormula;

        //print roof
        for (int i = 0; i < (n + 1) / 2; i++) {
            System.out.print(repeatStr("-", hyphensFormula - i));
            System.out.print(repeatStr("*", starsFormula + 2 * i));
            System.out.println(repeatStr("-", hyphensFormula - i));
        }

        //print base
        for (int i = 0; i < n / 2; i++) {
            System.out.print("|");
            System.out.print(repeatStr("*", n - 2));
            System.out.println("|");

            
        }
    }
}
