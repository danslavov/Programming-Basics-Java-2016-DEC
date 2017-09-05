import java.util.Scanner;

public class Firm {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hoursNeeded = scanner.nextInt();
        int daysAvailable = scanner.nextInt();
        int overtimeWorkers = scanner.nextInt();


        int hoursAvailable = (daysAvailable * 8) * 9 / 10 +
                (overtimeWorkers * daysAvailable * 2);
        int difference = hoursAvailable - hoursNeeded;

        if (difference >= 0) {
            System.out.println("Yes!" + difference + " hours left.");
        } else {
            System.out.println("Not enough time!" + Math.abs(difference) + " hours needed.");
        }
    }
}