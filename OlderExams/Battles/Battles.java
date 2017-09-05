import java.util.Scanner;

public class Battles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pok1 = Integer.parseInt(scanner.nextLine());
        int pok2 = Integer.parseInt(scanner.nextLine());
        int maxBattles = Integer.parseInt(scanner.nextLine());

        int currentPok1 = 1;
        int battles = 1;

        for (int j = currentPok1; j <= pok1; j++, currentPok1++) {
            int currentPok2 = 1;
            for (int k = currentPok2; k <= pok2; k++, currentPok2++, battles++) {
                if (battles <= maxBattles) {
                    System.out.printf("(%d <-> %d) ", currentPok1, currentPok2);
                } else {
                    return;
                }
            }
        }
    }
}

