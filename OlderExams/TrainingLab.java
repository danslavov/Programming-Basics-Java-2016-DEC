import java.util.Scanner;

public class Exam01_TrainingLab {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        double height = Double.parseDouble(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());
        double placesHeight = Math.floor(height / 1.2);
        double placesWeight = Math.floor((weight - 1) / 0.7);
        double places = placesHeight * placesWeight - 3;
        System.out.println(places);
    }
}
