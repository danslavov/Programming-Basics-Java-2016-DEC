import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class p13_1000DaysAfterBirth {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String dateStartString = console.nextLine();
        LocalDate dateStart = LocalDate.parse(dateStartString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        dateStart = dateStart.plusDays(999);
        String dateEnd = dateStart.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        System.out.print(dateEnd);
    }


}
