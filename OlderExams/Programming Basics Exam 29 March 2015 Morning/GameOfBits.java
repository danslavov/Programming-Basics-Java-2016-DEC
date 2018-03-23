import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameOfBits {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long number = Long.parseLong(reader.readLine());
        String command;

        while (!"Game Over!".equalsIgnoreCase(command = reader.readLine())) {
            if ("Odd".equalsIgnoreCase(command)) {
                number = extractAtPositions(number, 0);
            } else {
                number = extractAtPositions(number, 1);
            }
        }

        String numberAsBinaryString = Long.toBinaryString(number);
        int count = 0;
        for (int i = 0; i < numberAsBinaryString.length(); i++) {
            char binaryDigit = numberAsBinaryString.charAt(i);
            if (binaryDigit == '1') {
                count++;
            }
        }
        System.out.println(number + " -> " + count);
    }

    // evenOrOdd: 0 indicates odd positions, 1 indicates even positions
    private static long extractAtPositions(long number, int evenOrOdd) {
        StringBuilder numberAsString = new StringBuilder(Long.toBinaryString(number));
        numberAsString = numberAsString.reverse();
        StringBuilder resultNumberAsString = new StringBuilder();
        for (int i = 0; i < numberAsString.length(); i++) {
            if (i % 2 == evenOrOdd) {
                resultNumberAsString.append(numberAsString.charAt(i));
            }
        }
        if (resultNumberAsString.length() != 0) {
            return Long.parseLong(resultNumberAsString.reverse().toString(), 2);
        } else {
            return 0;
        }
    }
}
