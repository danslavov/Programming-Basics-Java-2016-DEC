import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double priceStudio = 76.0;
        double priceApt = 77.0;

        //check month

        if (month.equals("May") || month.equals("October")) {
            priceStudio = 50;
            priceApt = 65;
        }
        if (month.equals("June") || month.equals("September")) {
            priceStudio = 75.2;
            priceApt = 68.7;
        }

        //check nights

        if (nights > 14) {
            if (month.equals("May") || month.equals("October")) {
                priceStudio *= 0.7;
            }
            if (month.equals("June") || month.equals("September")) {
                priceStudio *= 0.8;
            }
            priceApt *= 0.9;
        } else if (nights > 7 && (month.equals("May") || month.equals("October"))) {
            priceStudio *= 0.95;
        }

        double priceTotalStudio = priceStudio * nights;
        double priceTotalApt = priceApt * nights;
        System.out.printf("Apartment: %.02f lv.%nStudio: %.02f lv.",
                priceTotalApt, priceTotalStudio);
    }
}