import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasketBattle {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] firstPlayerPoints = new int[]{0};
        int[] secondPlayerPoints = new int[]{0};
        String firstToPlay = reader.readLine();
        String secondToPlay = "Simeon".equals(firstToPlay) ? "Nakov" : "Simeon";
        int rounds = Integer.parseInt(reader.readLine());
        boolean haveWinner;

        for (int i = 1; i <= rounds; i++) {

            if (i % 2 != 0) {
                haveWinner = tryToWin(firstPlayerPoints, secondPlayerPoints, firstToPlay, i);
                if (haveWinner) {
                    return;
                }
                haveWinner = tryToWin(secondPlayerPoints, firstPlayerPoints, secondToPlay, i);
                if (haveWinner) {
                    return;
                }
            } else {
                haveWinner = tryToWin(secondPlayerPoints, firstPlayerPoints, secondToPlay, i);
                if (haveWinner) {
                    return;
                }
                haveWinner = tryToWin(firstPlayerPoints, secondPlayerPoints, firstToPlay, i);
                if (haveWinner) {
                    return;
                }
            }
        }

        if (firstPlayerPoints[0] == secondPlayerPoints[0]) {
            System.out.printf("DRAW%n%d%n", firstPlayerPoints[0]);
        } else {
            int diff = firstPlayerPoints[0] - secondPlayerPoints[0];
            System.out.printf("%s%n%d",
                    (diff > 0) ? firstToPlay : secondToPlay,
                    Math.abs(diff));
        }
    }

    private static boolean tryToWin(
            int[] firstPlayerPoints, int[] secondPlayerPoints,
            String currentPlayer, int round) throws IOException {

        int possiblePoints = Integer.parseInt(reader.readLine());
        String attempt = reader.readLine();

        if ("success".equalsIgnoreCase(attempt)) {
            if (500 - firstPlayerPoints[0] >= possiblePoints) {
                firstPlayerPoints[0] += possiblePoints;
            }
        }

        if (firstPlayerPoints[0] == 500) {
            System.out.printf("%s%n%d%n%d%n", currentPlayer, round, secondPlayerPoints[0]);
            return true;
        }
        return false;
    }
}
