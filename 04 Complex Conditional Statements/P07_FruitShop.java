import java.util.Scanner;

public class P07_FruitShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String fruit = console.nextLine();
        String day = console.nextLine();
        double quantity = Double.parseDouble(console.nextLine());
        double price = -1; // -1, за да се отпечата „error“ при невалидно име на плода или деня, т.е. когато не задаваме конретна price; вместо да задаваме default:

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit) {
                    case "banana":
                        price = 2.50;
                        break;
                    case "apple":
                        price = 1.20;
                        break;
                    case "orange":
                        price = 0.85;
                        break;
                    case "grapefruit":
                        price = 1.45;
                        break;
                    case "kiwi":
                        price = 2.70;
                        break;
                    case "pineapple":
                        price = 5.50;
                        break;
                    case "grapes":
                        price = 3.85;
                        break;
                }
                break;
            case "Saturday":
            case "Sunday":
                switch (fruit) {
                    case "banana":
                        price = 2.70;
                        break;
                    case "apple":
                        price = 1.25;
                        break;
                    case "orange":
                        price = 0.90;
                        break;
                    case "grapefruit":
                        price = 1.60;
                        break;
                    case "kiwi":
                        price = 3.00;
                        break;
                    case "pineapple":
                        price = 5.60;
                        break;
                    case "grapes":
                        price = 4.20;
                        break;
                }
        }

        double total = quantity * price;
        if (total >= 0) {
            System.out.println(total);
        } else {
            System.out.println("error");
        }
    }
}

