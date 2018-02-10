import java.util.Scanner;

public class P05_InvalidNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        boolean isValid = num == 0 || (num >= 100 && num <= 200);

        if(!isValid) {
            System.out.println("invalid");

        }
    }
}
