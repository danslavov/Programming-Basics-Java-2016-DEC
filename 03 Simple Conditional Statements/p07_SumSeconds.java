import java.util.Scanner;

public class p07_SumSeconds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num1 = Integer.parseInt(console.nextLine());
        int num2 = Integer.parseInt(console.nextLine());
        int num3 = Integer.parseInt(console.nextLine());
        int sum = num1 + num2 + num3;
        int min = sum / 60;
        int sec = sum % 60;
        System.out.printf("%d:%02d", min, sec);
    }
}
