import java.util.Scanner;

public class P10_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numberCount; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > largest) {
                largest = number;
            }
        }

        if (sum == 2 * largest) {
            System.out.printf("Yes%nSum = %d", largest);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(sum - 2* largest));
       }
    }
}
