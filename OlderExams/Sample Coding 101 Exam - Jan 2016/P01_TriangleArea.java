import java.text.DecimalFormat;
import java.util.Scanner;

public class P01_TriangleArea {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("####.####");
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());

        int base = Math.abs(x2 - x3);
        int height = Math.abs(y1 - y2);
        double area = base * height / 2d;

        System.out.println(df.format(area));
    }
}