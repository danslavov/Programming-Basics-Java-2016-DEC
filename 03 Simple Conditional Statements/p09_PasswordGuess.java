import java.util.Scanner;

public class p09_PasswordGuess {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();

        if(input.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        }
        else {
            System.out.println("Wrong password!");
        }
    }
}
