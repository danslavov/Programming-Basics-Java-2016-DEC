import java.util.Scanner;

public class P11_Cinema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String showType = console.nextLine().toLowerCase();
        int r = Integer.parseInt(console.nextLine());
        int c = Integer.parseInt(console.nextLine());
        double price = -1;

        switch (showType) {
            case "premiere":
                price = 12;
                break;
            case "normal":
                price = 7.5;
                break;
            case "discount":
                price = 5;
                break;
        }

        double result = r * c * price;
        System.out.printf("%.2f leva", result);
    }
}
