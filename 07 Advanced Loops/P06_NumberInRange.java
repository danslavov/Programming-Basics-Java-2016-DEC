import java.util.Scanner;

public class P06_NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
            while (n < 1 || n > 100) {
                System.out.print("Invalid number!\nЕnter a number in the range [1...100]: ");
                n = scanner.nextInt();
            }
        System.out.println("The number is: " + n);
    }
}
