import java.util.Scanner;

public class Exam02_Borsa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceVegetables = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        int amountVegetables = Integer.parseInt(scanner.nextLine());
        int amountFruits = Integer.parseInt(scanner.nextLine());

        double income = (priceVegetables * amountVegetables + priceFruits * amountFruits) / 1.94;

        System.out.println(income);  // обаче изкарва и нулите след десетичната точка
    }
}
