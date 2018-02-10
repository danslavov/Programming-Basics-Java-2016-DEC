import java.util.Scanner;

public class P01_PersonalTitles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double age = Double.parseDouble(console.nextLine());
        String sex = console.nextLine();

        if (age < 16) {
            if (sex.equals("f")) {
                System.out.println("Miss");
            } else {
                System.out.println("Master");
            }
        } else if (age >= 16) {
            if (sex.equals("f")) {
                System.out.println("Ms.");
            } else {
                System.out.println("Mr.");
            }
        }
    }
}
