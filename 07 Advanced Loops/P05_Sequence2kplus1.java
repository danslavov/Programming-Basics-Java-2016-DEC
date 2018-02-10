import java.util.Scanner;

public class P05_Sequence2kplus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        for (int i = 1; i <= n; i = i * 2 + 1) {
//            System.out.println(i);
//        }
        int num = 1;
        while (num <= n) {
            System.out.println(num);
            num = 2 * num + 1;

        }
    }
}
