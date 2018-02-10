import java.util.Scanner;

public class p10_Number100to200 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        String answer = "";

        if (a < 100) {
            answer = "Less than 100";
        }
        if (a >= 100 && a <= 200) {
            answer = "Between 100 and 200";
        }
        if (a > 200) {
            answer = "Greater than 200";
        }
        System.out.println(answer);
    }
}
