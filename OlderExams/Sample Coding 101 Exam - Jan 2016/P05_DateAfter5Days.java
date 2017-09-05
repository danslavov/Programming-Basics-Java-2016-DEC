import java.util.Scanner;

public class P05_DateAfter5Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine()) + 5;
        int month = Integer.parseInt(scanner.nextLine());
        int daysInMonth = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 2:
                daysInMonth = 28;
                break;
            default:
                daysInMonth = 30;
        }
        boolean nextMonth = (daysInMonth == 31 && day > 31) ||
                (daysInMonth == 30 && day > 30) ||
                (daysInMonth == 28 && day > 28);

        if (nextMonth) {
            day -= daysInMonth;
            month += 1;
        }
        if (month > 12) {
            month -= 12;
        }

        System.out.printf("%d.%02d", day, month);
    }
}
