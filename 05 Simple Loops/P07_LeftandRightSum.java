import java.util.Scanner;

public class P07_LeftandRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < numberCount; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum1 += num;
        }

        for (int i = 0; i < numberCount; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum2 += num;
        }

        int difference = Math.abs(sum1 - sum2);

        if (difference == 0) {
            System.out.println("Yes, sum = " + sum1);
        } else {
            System.out.println("No, diff = " + difference);
        }
    }
}
