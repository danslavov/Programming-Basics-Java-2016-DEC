import java.util.Scanner;

public class p02_InchesToCentimeter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter inches: ");
        double a = Double.parseDouble(console.nextLine());
        double b = a * 2.54;
        System.out.print("Result is: " + b);

    }
}
