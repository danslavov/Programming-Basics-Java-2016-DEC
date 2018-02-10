import java.util.Scanner;

public class P05_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggest = Integer.MIN_VALUE;
        int numberCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberCount; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > biggest) {
                biggest = num;
            }
        }
        System.out.println(biggest);
    }
}
