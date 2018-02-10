import java.util.Scanner;

public class p09_CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double degreeCelsius = Double.parseDouble(console.nextLine());
        double degreeFahrenheit = degreeCelsius * 9 / 5 + 32;

        System.out.printf("%.2f", degreeFahrenheit);
    }
}
