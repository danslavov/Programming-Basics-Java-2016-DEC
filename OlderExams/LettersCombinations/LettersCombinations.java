import java.util.Scanner;

public class tmp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char start = scanner.next().charAt(0);
        char end = scanner.next().charAt(0);
        char exclude = scanner.next().charAt(0);
        int count = 0;

        for (char i = start; i <= end; i++) {
            if (i != exclude) {
                for (char j = start; j <= end; j++) {
                    if (j != exclude) {
                        for (char k = start; k <= end; k++) {
                            if (k != exclude) {
                                System.out.printf("%s%s%s ", i, j, k);
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
