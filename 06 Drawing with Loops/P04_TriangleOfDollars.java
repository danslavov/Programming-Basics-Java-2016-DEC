import java.util.Scanner;

public class P04_TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String dollar = "$";
        System.out.println(dollar);
        for (int j = 0; j < n - 1; j++) {
            dollar += " $";
            System.out.println(dollar);
        }
    }
}
