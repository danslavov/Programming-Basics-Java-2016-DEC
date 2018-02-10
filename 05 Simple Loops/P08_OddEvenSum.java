import java.util.Scanner;

public class P08_OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCount = Integer.parseInt(scanner.nextLine());
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 1; i <= numberCount; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            boolean possitioinIsOdd = (i % 2 == 0);
            if (possitioinIsOdd) {
                sumOdd += num;
            } else {
                sumEven += num;
            }
        }

        int difference = Math.abs(sumEven - sumOdd);

        if (difference == 0) {
            System.out.printf("Yes%nSum = %d", sumEven);
            } else {
            System.out.printf("No%nDiff = %d", difference);
        }
    }
}