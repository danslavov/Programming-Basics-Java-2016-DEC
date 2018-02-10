import java.util.Scanner;

public class P12_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 1;
        int old = 0;
        int oldSum;
        for (int i = 0; i < n; i++) {
            oldSum = sum;
            sum += old;
            old = oldSum;
        }
        System.out.println(sum);
    }
}
