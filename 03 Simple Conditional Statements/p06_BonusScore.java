import java.util.Scanner;

public class p06_BonusScore {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int points = Integer.parseInt (console.nextLine());
        double bonus = 0;

        if (points > 1000) {
            bonus = points * 0.1;
        }   else if (points > 100) {
            bonus = points * 0.2;
        }   else {
            bonus = 5;
        }
        if (points % 2 == 0) {
            bonus += 1;
        }
        if (points % 10 == 5) {
            bonus += 2;
        }

        System.out.printf ("%f%n%f", bonus, points+bonus);
    }
}

