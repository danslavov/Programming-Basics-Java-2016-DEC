import java.util.Scanner;

public class P06_PointonRectangleBorder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());
        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());
        boolean isOnTop = x >= x1 && x <= x2 && y == y1;
        boolean isOnBottom = x >= x1 && x <= x2 && y == y2;
        boolean isOnLeft = y >= y1 && y <= y2 && x == x1;
        boolean isOnRight = y >= y1 && y <= y2 && x == x2;

        if (isOnTop || isOnBottom || isOnLeft || isOnRight) {
            System.out.println("Border");
        } else System.out.println("Inside / Outside");
    }
}
