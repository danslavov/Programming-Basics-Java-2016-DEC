import java.util.Scanner;

public class Exam01_OnTimeforExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHours = Integer.parseInt(scanner.nextLine());
        int examTime = Integer.parseInt(scanner.nextLine());
        int studentHours = Integer.parseInt(scanner.nextLine());
        int studentTime = Integer.parseInt(scanner.nextLine());

        examTime += examHours * 60;
        studentTime += studentHours * 60;
        int difference = Math.abs(examTime - studentTime);
        boolean studentIsEarly = examTime > studentTime;
        boolean studentIsLate = studentTime > examTime;

        if (examTime - studentTime > 30) {
            System.out.println("Early");
        } else if (studentIsLate) {
            System.out.println("Late");
        } else {
            System.out.println("On time");
        }

        if (difference >= 1) {
            int hours = difference / 60;
            int minutes = difference % 60;
            if (studentIsEarly && (difference < 60)) {
                System.out.println(difference + " minutes before the start");
            } else if (studentIsEarly && (difference >= 60)) {
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            } else if (studentIsLate && (difference < 60)) {
                System.out.println(difference + " minutes after the start");
            } else if (studentIsLate && (difference >= 60)) {
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            }
        }
    }
}