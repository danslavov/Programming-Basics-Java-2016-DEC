import java.util.Scanner;

public class Profit {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysPerMonth = scanner.nextInt();
        double moneyPerDay = scanner.nextDouble();
        double convRate = scanner.nextDouble();

        double moneyPerMonth = daysPerMonth * moneyPerDay;
        double bonus = moneyPerMonth * 2.5;
        double netMoney = (moneyPerMonth * 12 + bonus) * 0.75;
        double netMoneyPerDay = netMoney / 365;
        double netMoneyPerDayLeva = netMoneyPerDay * convRate;

        System.out.printf("%.02f", netMoneyPerDayLeva);
    }
}