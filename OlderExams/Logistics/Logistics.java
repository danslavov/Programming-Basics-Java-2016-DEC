import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        double priceTotal = 0.0;
        int weightVan = 0;
        int weightTruck = 0;
        int weightTrain = 0;

        for (int i = 0; i < count; i++) {
            int weight = Integer.parseInt(scanner.nextLine());
            if (weight < 4) {
                weightVan += weight;
                priceTotal += (weight * 200.0);
            } else if (weight < 12) {
                weightTruck += weight;
                priceTotal += (weight * 175.0);
            } else {
                weightTrain += weight;
                priceTotal += (weight * 120.0);
            }
        }
        int weightTotal = weightVan + weightTruck + weightTrain;
        double priceMean = priceTotal / weightTotal;
        double weightVanShare = weightVan * 100.0 / weightTotal;
        double weightTruckShare = weightTruck * 100.0 / weightTotal;
        double weightTrainShare = weightTrain * 100.0 / weightTotal;

        System.out.printf("%.02f%n%.02f%%%n%.02f%%%n%.02f%%%n",
                priceMean, weightVanShare, weightTruckShare, weightTrainShare);

    }
}