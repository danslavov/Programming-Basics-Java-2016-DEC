import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnoliaCount = Integer.parseInt(scanner.nextLine());
        int zumbulCount = Integer.parseInt(scanner.nextLine());
        int roseCount = Integer.parseInt(scanner.nextLine());
        int cactusCount = Integer.parseInt(scanner.nextLine());
        double pricePresent = Double.parseDouble(scanner.nextLine());

        double magnoliaPrice = 3.25;
        double zumbulPrice = 4.0;
        double rosePrice = 3.5;
        double cactusPrice = 8.0;

        double priceFlowers = (magnoliaCount * magnoliaPrice + zumbulCount * zumbulPrice +
                roseCount * rosePrice + cactusCount * cactusPrice) * 0.95;

        double diff = priceFlowers - pricePresent;
        if (diff >= 0) {
            System.out.printf("She is left with %.0f leva.%n", Math.floor(Math.abs(diff)));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(Math.abs(diff)));
        }
    }
}