import java.util.Scanner;

public class StopNumber {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());

        for (int i = max; i >= min; i--) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                if (i != stop) {
                    System.out.print(i + " ");
                } else {
                    return;
                }
            }
        }
    }
}