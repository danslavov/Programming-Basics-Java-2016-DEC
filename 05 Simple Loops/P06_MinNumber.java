import java.util.Scanner;

public class P06_MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;
        int numberCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberCount; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println(smallest);
    }
}
