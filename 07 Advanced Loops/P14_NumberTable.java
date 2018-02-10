import java.util.Scanner;

public class P14_NumberTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if ((row + col + 1 < n) && (col != n - 1)) {
                    System.out.print(row + col + 1 + " ");
                } else if ((row + col + 1 < n) && (col == n - 1)) {
                    System.out.print(row + col + 1);
                } else if ((row + col + 1 >= n) && (col != n - 1)) {
                    System.out.print(2 * n - (row + col + 1) + " ");
                } else {
                    System.out.print(2 * n - (row + col + 1));
                }
            }
            System.out.println();
        }
    }
}
