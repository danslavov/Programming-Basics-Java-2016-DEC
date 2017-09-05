import java.util.Scanner;

public class Money {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoins = Integer.parseInt(scanner.nextLine());
        double yuans = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());
        double euro = ((bitcoins * 1168) / 1.95) + (((yuans * 0.15) * 1.76) / 1.95);
        double result = euro - euro * commission / 100;

        System.out.println(result);
    }
}