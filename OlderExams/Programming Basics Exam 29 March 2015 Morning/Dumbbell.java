import java.util.Scanner;

public class Dumbbell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // top border
        String borderLeft = draw('.', (n - n/2 - 1)) + draw('&', n/2 + 1);
        String borderRight =  draw('&', n/2 + 1) + draw('.', (n - n/2 - 1));
        String border = borderLeft + draw('.', n) + borderRight;
        System.out.println(border);

        String empty = draw('.', n);

        // top inside
        for (int i = 0; i < (n/2 - 1); i++) {
            String left = draw('.', n/2 -i -1) +
                    '&' + draw('*', n/2 +i) + '&';
            String total = left + empty + new StringBuilder(left).reverse().toString();
            System.out.println(total);
        }

        // bar
        String barSide = "&" + draw('*', n - 2) + "&";
        String bar = barSide + draw('=', n) + barSide;
        System.out.println(bar);

        // bottom inside
        for (int i = 1; i <= (n/2 - 1); i++) {
            String left = draw('.', i) + '&' + draw('*', n-2-i) + '&';
            String total = left + empty + new StringBuilder(left).reverse().toString();
            System.out.println(total);
        }

        // bottom border
        System.out.println(border);
    }

    private static String draw(char c, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(c);
        }
        return result.toString();
    }
}
