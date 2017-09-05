import java.util.Scanner;

public class P04_PointInFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        boolean isInside = (x >= 2 && x <= 12) && (y >= -3 && y <= 1) ||
                (x >= 4 && x <= 10) && (y >= -5 && y <= -3) ||
                (x >= 4 && x <= 10) && ((y >= -5 && y <= -3) || (y >= 1 && y <= 3));
        System.out.println(isInside ? "in" : "out");
    }
}
