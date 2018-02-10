import java.util.Scanner;

public class P13_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int currentNum = 1;
        int j = 1;

        while (true) {
            for (int i = 0; i < j; i++) {
                if (currentNum > n) {
                    return;
                }
                System.out.print(currentNum + " ");
                currentNum++;
            }
            System.out.println();
            j++;
        }
    }
}
