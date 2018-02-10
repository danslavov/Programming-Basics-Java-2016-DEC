import java.util.Scanner;

public class p06_CircleAreaandPerimeter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double r = Double.parseDouble(console.nextLine());
        double circleArea = Math.PI * r * r;
        double circlePerimeter = 2 * Math.PI * r;
        System.out.printf("Area: %f%nPerimeter: %f", circleArea, circlePerimeter);

    }
}
