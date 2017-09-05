import java.util.Scanner;

public class Exam01_TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = Integer.parseInt(scanner.nextLine());
        String tariff = scanner.nextLine().toLowerCase();
        double price = 0;
        double priceTrain = Double.MAX_VALUE;
        double priceBus = Double.MAX_VALUE;
        double priceTaxi = 0.7;
        boolean canBeTrain = distance >= 100;
        boolean canBeBus = distance >= 20;

        if (canBeTrain) {
            priceTrain = distance * 0.06;
        }
        if (canBeBus) {
            priceBus = distance * 0.09;
        }
        if(tariff.equals("day")) {
            priceTaxi += distance * 0.79;
        } else {
            priceTaxi += distance * 0.9;
        }
        price = Math.min(Math.min(priceTrain, priceBus), priceTaxi);
        System.out.println(price);
    }
}