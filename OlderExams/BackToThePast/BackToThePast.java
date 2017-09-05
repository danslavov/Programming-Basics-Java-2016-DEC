import java.util.Scanner;

public class BackToThePast {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int endYear = Integer.parseInt(scanner.nextLine());

        int ageIvan = 18;
        double spendForAge = 0;

        for (int i = 1800; i <= endYear; i++, ageIvan++) {
            if (i % 2 != 0) {
                spendForAge += ageIvan * 50;
            }
        }

        double spend = (endYear - 1799) * 12000 + spendForAge;
        double difference = money - spend;

        if (difference >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.02f dollars left.", Math.abs(difference));
        } else {
            System.out.printf("He will need %.02f dollars to survive.", Math.abs(difference));
        }
    }
}