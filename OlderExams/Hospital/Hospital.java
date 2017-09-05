import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int doctors = 7;
        int patientsTreated = 0;
        int patientsNotTreated = 0;


        for (int i = 1; i <= days; i++) {
            int patients = scanner.nextInt();
            boolean moreDoctorsNeeded = (i % 3 == 0) && (patientsNotTreated > patientsTreated);
            if (moreDoctorsNeeded) {
                doctors++;
            }
            int difference = patients - doctors;
            if (difference > 0) {
                patientsNotTreated += difference;
                patientsTreated += doctors;
            } else {
                patientsTreated += patients;
            }
        }

        System.out.printf("Treated patients: %d.%nUntreated patients: %d.",
                patientsTreated, patientsNotTreated);
    }
}