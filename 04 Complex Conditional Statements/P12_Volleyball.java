import java.util.Scanner;

public class P12_Volleyball {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String leap = console.nextLine();
        int p = Integer.parseInt(console.nextLine());
        int h = Integer.parseInt(console.nextLine());
        double volleySofia = (48 - h) * 3d / 4d;
        double volleyProvince = p * 2d / 3d;
        double volleyTotal = volleySofia + volleyProvince + h;
        if (leap.equals("leap")) {
            volleyTotal = volleyTotal * 1.15;
        }
        System.out.printf("%f", Math.floor(volleyTotal));  //  За да се отпечата само цялото число, volleyTotal може да се кастне към (int). В домашното пише да се използва Math.Truncate().
    }
}
