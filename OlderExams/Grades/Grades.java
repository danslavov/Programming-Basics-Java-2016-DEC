import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentCount = Integer.parseInt(scanner.nextLine());
        double gradeSum = 0;
        int top = 0;
        int above4 = 0;
        int above3 = 0;
        int fail = 0;

        for (int i = 0; i < studentCount; i++) {
            double gradeCurrent = Double.parseDouble(scanner.nextLine());
            gradeSum += gradeCurrent;
            if (gradeCurrent >= 5) {
                top++;
            } else if (gradeCurrent >= 4) {
                above4++;
            } else if (gradeCurrent >=3) {
                above3++;
            } else {
                fail++;
            }
        }
        double topPercent = 100.0 * top / studentCount;
        double above4Percent = 100.0 * above4 / studentCount;
        double above3Percent = 100.0 * above3 / studentCount;
        double failPercent = 100.0 * fail / studentCount;
        double gradeAverage = gradeSum / studentCount;

        System.out.printf("Top students: %.2f%%%nBetween 4.00 and 4.99: %.2f%%%n" +
                "Between 3.00 and 3.99: %.2f%%%nFail: %.2f%%%nAverage: %.2f%n",
                topPercent, above4Percent, above3Percent, failPercent, gradeAverage);
    }
}
