import java.util.Scanner;

public class SleepyTomCat {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int holidays = Integer.parseInt(scanner.nextLine());
        int playTime = (365 - holidays) * 63 + holidays * 127;
        int difference = 30000 - playTime;
        int hours = Math.abs(difference) / 60;
        int minutes = Math.abs(difference) % 60;

        if (difference >= 0) {
            System.out.printf("Tom sleeps well%n%d hours and %d minutes less for play",
                    hours, minutes);
        } else {
            System.out.printf("Tom will run away%n%d hours and %d minutes more for play",
                    hours, minutes);
        }
    }
}
