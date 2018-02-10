import java.util.Scanner;

public class p01_ExcellentResult {

    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        double grade = Double.parseDouble(console.nextLine());
        if (grade >= 5.5) {
            System.out.println("Excellent!");
        }
    }
}
