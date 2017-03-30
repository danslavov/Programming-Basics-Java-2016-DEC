import java.util.Scanner;

public class P02_WorkHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hoursNeeded = Integer.parseInt(scanner.nextLine());
        int workersCount = Integer.parseInt(scanner.nextLine());
        int daysCount = Integer.parseInt(scanner.nextLine());

        int hoursAvailable = workersCount * daysCount * 8;
        int diff = hoursAvailable - hoursNeeded;
        int penalty = daysCount * Math.abs(diff);

        if (diff >= 0) {
            System.out.printf("%d hours left", diff);
        } else {
            System.out.printf("%d overtime%nPenalties: %d", Math.abs(diff), penalty);
        }
    }
}
