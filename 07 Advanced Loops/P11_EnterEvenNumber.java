import java.util.Scanner;

public class P11_EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;

        while (true) {
            try {
                System.out.print("Enter even number: ");
                n = Integer.parseInt(scanner.nextLine());
                if (n % 2 != 0) {
                    System.out.printf("The number is not even.%nEnter even number: ");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.printf("Invalid number!%n");
            }
        }
        System.out.println("Even number entered: " + n);
    }
}
