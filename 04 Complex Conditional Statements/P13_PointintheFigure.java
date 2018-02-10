import java.util.Scanner;

public class P13_PointintheFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        boolean isInside = ((x > 0 && x < 3 * h) && (y > 0 && y < h)) ||
                ((x > h && x < 2 * h) && (y > 0 && y < 4 * h));
        boolean isBorder = ((x >= 0 && x <= 3 * h) && y == 0) ||
                ((x == 0 || x == 3 * h) && (y >= 0 && y <= h)) ||
                (((x >= 0 && x <= h) || (x >= 2 * h && x <= 3 * h)) && (y == h)) ||
                ((x == h || x == 2 * h) && (y >= h && y <= 4 * h)) ||
                (x >= h && x <= 2 * h) && (y == 4 * h);

        if (isInside) {
            System.out.println("inside");
        } else if (isBorder) {
            System.out.println("border");
        } else {
            System.out.println("outside");
        }
    }
}
