import java.util.Scanner;

public class P03_CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String carClass = "";
        String carType = "";
        double price = 0;

        if (budget <= 100) {
            carClass = "Economy class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                price = budget * 35 / 100;
            } else if (season.equals("Winter")) {
                carType = "Jeep";
                price = budget * 65 / 100;
            }
        } else if (budget > 100 && budget <= 500) {
            carClass = "Compact class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                price = budget * 45 / 100;
            } else if (season.equals("Winter")) {
                carType = "Jeep";
                price = budget * 80 / 100;
            }
        } else if (budget > 500) {
            carClass = "Luxury class";
            carType = "Jeep";
            price = budget * 90 / 100;
        }

        System.out.printf("%s%n%s - %.2f", carClass, carType, price);
    }
}
