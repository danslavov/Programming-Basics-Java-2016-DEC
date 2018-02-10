import java.util.Scanner;

public class p10_RadianstoDegrees {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double rad = Double.parseDouble(console.nextLine());
        int degree = (int) (rad * 180 / Math.PI);
        System.out.println(degree);
    }
}
