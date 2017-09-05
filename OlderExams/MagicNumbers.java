import java.util.Scanner;

public class MagicNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int digit;
        int currentNum;

        for (int i = 111111; i < 1000000; i++) {
            int product = 1;
            currentNum = i;
            while (currentNum > 0) {
                digit = currentNum % 10;
                product *= digit;
                if (product == 0) {	//може и без тва
                    break;
                }
                currentNum /= 10;
            }
            if (product == n) {
                System.out.print(i + " ");
            }
        }
    }
}