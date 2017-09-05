import java.text.DecimalFormat;
import java.util.Scanner;

public class Exam00_Tiles {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double groundSide = Double.parseDouble(scanner.nextLine());
        double tileWidth = Double.parseDouble(scanner.nextLine());
        double tileLength = Double.parseDouble(scanner.nextLine());
        double benchWidth = Double.parseDouble(scanner.nextLine());
        double benchLength = Double.parseDouble(scanner.nextLine());

        DecimalFormat format = new DecimalFormat ("####.############");
        double tileNumber = ((groundSide * groundSide) -
                (benchWidth * benchLength)) / (tileLength * tileWidth);
        double time = tileNumber * 0.2;

        System.out.println(format.format(tileNumber));
        System.out.println(format.format(time));
    }
}
