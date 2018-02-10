import java.text.DecimalFormat;
import java.util.Scanner;

public class P11_OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        int countNumber = Integer.parseInt(scanner.nextLine());
        double oddSum = 0;
        double oddMin = Double.MAX_VALUE;
        double oddMax = -Double.MAX_VALUE;
        double evenSum = 0;
        double evenMin = Double.MAX_VALUE;
        double evenMax = -Double.MAX_VALUE;
        boolean hasOdd = false;
        boolean hasEven = false;

        if (countNumber >= 2) {
            hasEven = true;
            hasOdd = true;
        } else if (countNumber == 1) {
            hasOdd = true;
        }

        for (int i = 1; i <= countNumber; i++) {
            boolean positionIsEven = i % 2 == 0;
            double currentNumber = Double.parseDouble(scanner.nextLine());
            if (positionIsEven) {
                evenSum += currentNumber;
                if (currentNumber > evenMax) {
                    evenMax = currentNumber;
                }
                if (currentNumber < evenMin) {
                    evenMin = currentNumber;
                }
            } else {
                oddSum += currentNumber;
                if (currentNumber > oddMax) {
                    oddMax = currentNumber;
                }
                if (currentNumber < oddMin) {
                    oddMin = currentNumber;
                }
            }
        }

        if (hasEven) {
            System.out.printf("OddSum=%s, OddMin=%s, OddMax=%s, EvenSum=%s, EvenMin=%s, EvenMax=%s",
                    df.format(oddSum), df.format(oddMin), df.format(oddMax), df.format(evenSum), df.format(evenMin), df.format(evenMax));

        } else if (hasOdd) {
            System.out.printf("OddSum=%s, OddMin=%s, OddMax=%s, EvenSum=0, EvenMin=No, EvenMax=No",
                    df.format(oddSum), df.format(oddMin), df.format(oddMax));

        } else {
            System.out.println("OddSum=0, OddMin=No, OddMax=No, EvenSum=0, EvenMin=No, EvenMax=No");
        }
    }
}