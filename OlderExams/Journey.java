import java.text.DecimalFormat;
import java.util.Scanner;

public class Exam02_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine().toLowerCase();
        String resort = "Hotel";
        String destination;
        double percent;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                resort = "Camp";
                percent = 0.3;
            } else {
                percent = 0.7;
            }
        } else if (budget > 100 && budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                resort = "Camp";
                percent = 0.4;
            } else {
                percent = 0.8;
            }
        } else {
            destination = "Europe";
            percent = 0.9;
        }
        DecimalFormat format = new DecimalFormat("#.00");
        double spendings = budget * percent;

        System.out.println("Somewhere in " + destination);
        System.out.println(resort + " - " + format.format(spendings));
    }
}
