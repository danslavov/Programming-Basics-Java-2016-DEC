import java.text.DecimalFormat;
import java.util.Scanner;

public class Exam02_PoolPipes {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int volume = Integer.parseInt(scanner.nextLine());
        int debitPipe1 = Integer.parseInt(scanner.nextLine());
        int debitPipe2 = Integer.parseInt(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        DecimalFormat format = new DecimalFormat("0.##");
        double volumeActual = (debitPipe1 + debitPipe2) * time;

        if(volumeActual <= volume) {
            double poolPercentFull = Math.floor(100 * volumeActual / volume);
            int portionPipe1 = 100 * debitPipe1 / (debitPipe1 + debitPipe2);
            int portionPipe2 = 100 * debitPipe2 / (debitPipe1 + debitPipe2);
            System.out.printf("The pool is %.0f%% full. Pipe 1: %d%%. Pipe 2: %d%%.", poolPercentFull, portionPipe1, portionPipe2);
        } else {
            double poolOverflows = volumeActual - volume;
            System.out.print("For " + format.format(time) + " hours the pool overflows with " + format.format(poolOverflows) + " liters.");
        }
    }
}
