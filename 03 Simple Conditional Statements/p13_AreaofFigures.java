import java.util.Scanner;

public class p13_AreaofFigures {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String figure = console.nextLine();
        double result = 0;

        if(figure.equals("square")) {
            double squareSide = Double.parseDouble(console.nextLine());
            result = Math.pow(squareSide, 2);
        }
        if(figure.equals("rectangle")) {
            double rectangleHeight = Double.parseDouble(console.nextLine());
            double rectangleWidth = Double.parseDouble(console.nextLine());
            result = rectangleHeight * rectangleWidth;
        }
        if(figure.equals("circle")) {
            double circleRadius = Double.parseDouble(console.nextLine());
            result = Math.PI * Math.pow(circleRadius, 2);
        }
        if(figure.equals("triangle")) {
            double triangleSide = Double.parseDouble(console.nextLine());
            double triangleHeight = Double.parseDouble(console.nextLine());
            result = triangleSide * triangleHeight / 2;
        }

        System.out.printf("%.3f", result);
    }
}
