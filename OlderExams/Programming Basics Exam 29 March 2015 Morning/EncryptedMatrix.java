import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EncryptedMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String message = reader.readLine();
        String diagonal = reader.readLine();

        StringBuilder numberAsString = convertMessageIntoNumber(message);
        StringBuilder encryptedNumberAsString = encryptNumber(numberAsString);
        int[][] matrix = fillNumberIntoMatrix(diagonal, encryptedNumberAsString);
        printResult(matrix);

//        printResult(fillNumberIntoMatrix(diagonal, encryptNumber(convertMessageIntoNumber(message))));
    }

    private static StringBuilder convertMessageIntoNumber(String message) {
        StringBuilder numberAsString = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            int ascii = message.charAt(i);
            String asciiAsString = String.valueOf(ascii);
            char digit = asciiAsString.charAt(asciiAsString.length() - 1);
            numberAsString.append(digit);
        }
        return numberAsString;
    }

    private static StringBuilder encryptNumber(StringBuilder numberAsString) {
        StringBuilder encryptedNumberAsString = new StringBuilder();

        for (int i = 0; i < numberAsString.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
            String result;
            if (digit % 2 == 0) {
                result = String.valueOf(digit * digit);
            } else {
                int previousDigit = i == 0 ? 0 :
                        Integer.parseInt(String.valueOf(numberAsString.charAt(i - 1)));
                int nextDigit = i == numberAsString.length() - 1 ? 0 :
                        Integer.parseInt(String.valueOf(numberAsString.charAt(i + 1)));
                result = String.valueOf(previousDigit + digit + nextDigit);
            }
            encryptedNumberAsString.append(result);
        }
        return encryptedNumberAsString;
    }

    private static int[][] fillNumberIntoMatrix(String diagonal, StringBuilder encryptedNumberAsString) {
        int matrixSize = encryptedNumberAsString.length();
        int[][] matrix = new int[matrixSize][matrixSize];

        if ("\\".equals(diagonal)) {
            for (int i = 0; i < matrixSize; i++) {
                int digitToFill = Integer.parseInt(String.valueOf(encryptedNumberAsString.charAt(i)));
                matrix[i][i] = digitToFill;
            }
        } else {
            for (int i = 0; i < matrixSize; i++) {
                int digitToFill = Integer.parseInt(String.valueOf(encryptedNumberAsString.charAt(i)));
                matrix[matrixSize - 1 - i][i] = digitToFill;
            }
        }
        return matrix;
    }

    private static void printResult(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row)
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", ""));
        }
    }
}
