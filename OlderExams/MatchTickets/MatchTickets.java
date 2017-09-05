import java.util.Scanner;

public class Temp {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgetGross = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double ticketPrice = (category.equals("VIP") ? 499.99 : 249.99);
        double ticketTotal = ticketPrice * people;
        double budget = 0.0;

        if (people < 5) {
            budget = budgetGross * 0.25;
        } else if (people < 10) {
            budget = budgetGross * 0.4;
        } else if (people < 25) {
            budget = budgetGross * 0.5;
        } else if (people < 50) {
            budget = budgetGross * 0.6;
        } else {
            budget = budgetGross * 0.75;
        }

        double difference = budget - ticketTotal;

        if (difference >= 0) {
            System.out.printf("Yes! You have %.02f leva left.%n", difference);
        } else {
            difference = Math.abs(difference);
            System.out.printf("Not enough money! You need %.02f leva.%n", difference);
        }

    }
}