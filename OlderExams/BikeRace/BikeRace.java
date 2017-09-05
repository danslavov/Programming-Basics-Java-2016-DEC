import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniorsCount = Integer.parseInt(scanner.nextLine());
        int seniorsCount = Integer.parseInt(scanner.nextLine());
        String path = scanner.nextLine();
        double juniorsPrice = 0;
        double seniorsPrice = 0;

        switch (path) {
            case "trail":
                juniorsPrice = 5.50;
                seniorsPrice = 7;
                break;
            case "cross-country":
                if (juniorsCount + seniorsCount < 50) {
                    juniorsPrice = 8;
                    seniorsPrice = 9.5;
                } else {
                    juniorsPrice = 8 * 0.75;
                    seniorsPrice = 9.5 * 0.75;
                }
                break;
            case "downhill":
                juniorsPrice = 12.25;
                seniorsPrice = 13.75;
                break;
            case "road":
                juniorsPrice = 20;
                seniorsPrice = 21.5;
                break;
        }
        double totalPrice = (juniorsPrice * juniorsCount + seniorsPrice * seniorsCount) * 0.95;
        System.out.printf("%.2f", totalPrice);
    }
}