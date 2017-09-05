import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int thirdDigit = num % 10;
        int secondDigit = (num / 10) % 10;
        int firstDigit = num / 100;
        int currentNum = num;
        int rows = firstDigit + secondDigit;
        int cols = firstDigit + thirdDigit;

        for (int i = 1; i <= rows * cols; i++) {
            if (currentNum % 5 == 0) {
                currentNum -= firstDigit;
            } else if (currentNum % 3 == 0) {
                currentNum -= secondDigit;
            } else {
                currentNum += thirdDigit;
            }

            if (i % cols == 0) {
                System.out.println(currentNum);
            } else {
                System.out.print(currentNum + " ");
            }
        }
    }
}