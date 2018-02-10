import java.util.Scanner;

public class P04_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberCount; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
        }

        System.out.println(sum);
    }
}
