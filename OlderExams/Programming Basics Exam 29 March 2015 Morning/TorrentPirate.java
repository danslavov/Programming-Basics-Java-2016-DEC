import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TorrentPirate {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int data = Integer.parseInt(reader.readLine());
        int cinemaPricePerMovie = Integer.parseInt(reader.readLine());
        int wifeSpending = Integer.parseInt(reader.readLine());

        double downloadTime = data / 2.0 / 3600;
        double downloadPrice = downloadTime * wifeSpending;
        double totalCinemaPrice = (data / 1500.0) * cinemaPricePerMovie;

        if (downloadPrice > totalCinemaPrice) {
            System.out.printf("cinema -> %.2flv", totalCinemaPrice);
        } else {
            System.out.printf("mall -> %.2flv", downloadPrice);
        }
    }
}
