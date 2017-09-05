import java.util.Scanner;

public class P07_SumsStep3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = 1;
        int sumCount = 1;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        while (i <= n) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (sumCount == 4) {
                sumCount = 1;
            }
            switch (sumCount) {
                case 1:
                    sum1 += currentNumber;
                    break;
                case 2:
                    sum2 += currentNumber;
                    break;
                case 3:
                    sum3 += currentNumber;
            }
            sumCount++;
            i++;
        }
        System.out.printf("sum1 = %d%nsum2 = %d%nsum3 = %d", sum1, sum2, sum3);
    }
}
