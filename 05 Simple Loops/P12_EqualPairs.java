import java.util.Scanner;

public class P12_EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumber = Integer.parseInt(scanner.nextLine());
        int prevSum = 0;
        int maxDiff = 0;
        int curSum = 0;


        for (int i = 0; i < countNumber; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            curSum = num1 + num2;
            if (i > 0) {
                int currentdiff = Math.abs(prevSum - curSum);

                if (currentdiff > maxDiff) {
                    maxDiff = currentdiff;
                }
            }
            prevSum = curSum;
        }
        if (maxDiff == 0) {
            System.out.println("Yes, value=" + curSum);
        } else {
            System.out.println("No, maxdiff=" + maxDiff);
        }
    }
}
