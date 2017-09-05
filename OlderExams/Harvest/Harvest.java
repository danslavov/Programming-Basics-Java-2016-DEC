import java.text.DecimalFormat;
import java.util.Scanner;

public class Harvest {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat noZero = new DecimalFormat("#.##########");

        int area = Integer.parseInt(scanner.nextLine());
        double yieldPerSq = Double.parseDouble(scanner.nextLine());
        int target = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double yield = area * yieldPerSq * 0.4 / 2.5;
        double difference = Math.abs(yield - target);

        if (yield < target) {
            difference = Math.floor(difference);
            System.out.println("It will be a tough winter! " +
                "More " + noZero.format(difference) + " liters wine needed.");
        } else {
            yield = Math.floor(yield);
            System.out.println("Good harvest this year! " +
                    "Total wine: " + noZero.format(yield) + " liters.");
            difference = Math.ceil(difference);
            double litresPerWorker = Math.ceil(difference / workers);
            System.out.println(noZero.format(difference) + " liters left -> " +
                    noZero.format(litresPerWorker) + " liters per person.");
        }
    }
}