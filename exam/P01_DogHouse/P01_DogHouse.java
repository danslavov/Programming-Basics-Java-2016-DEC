import java.util.Scanner;

public class P01_DogHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        double sideArea = a * a / 2;
        double backArea = (a / 2) * (a / 2) + ((a / 2) * (b - a / 2) / 2);
        double frontArea = backArea - ((a / 5) * (a / 5));

        double roofArea = a * a;
        double greenArea = 2 * sideArea + backArea + frontArea;
        double redPaint = roofArea / 5;
        double greenPaint = greenArea / 3;

        System.out.printf("%.2f%n%.2f%n", greenPaint, redPaint);

    }
}
