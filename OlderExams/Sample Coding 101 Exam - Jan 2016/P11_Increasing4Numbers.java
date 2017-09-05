import java.util.Scanner;

public class P11_Increasing4Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        if (a + 3 > b) {
            System.out.println("No");
            return;
        }

        for (int i = a; i <= b - 3; i++) {
            for (int j = a + 1; j <= b - 2; j++) {
                for (int k = a + 2; k <= b - 1; k++) {
                    for (int l = a + 3; l <= b; l++) {
                        boolean isIncremental = i < j && j < k && k < l;
                        if (!isIncremental) {
                            continue;
                        }
                        System.out.printf("%d %d %d %d%n", i, j, k, l);
                    }
                }
            }
        }
    }
}