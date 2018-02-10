import java.util.Scanner;

public class p07_2DRectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);

        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());

        double a = Math.max(x1,x2) - Math.min(x1,x2);
        double b = Math.max(y1,y2) - Math.min(y1,y2);
        double area = a*b;
        double perimeter = 2*a + 2*b;

        System.out.printf("Area: %f%nPerimeter: %f", area, perimeter);
    }
}
