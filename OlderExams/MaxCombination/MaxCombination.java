import java.util.Scanner;

public class MaxCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int i = first; i <= second; i++) {
            for (int j = first; (j <= second) && (count < stop); j++, count++) {
                System.out.printf("<%d-%d>", i, j);
            }
        }
    }
}