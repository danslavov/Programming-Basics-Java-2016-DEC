import java.util.Scanner;

public class P02_NumberNto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}
