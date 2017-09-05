import java.util.Scanner;

public class P12_GenerateRectangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int area = Integer.parseInt(scanner.nextLine());
        boolean hasArea = false;

        for (int x1 = -n; x1 < n; x1++) {
            for (int y1 = -n; y1 < n; y1++) {
                for (int x2 = x1 + 1; x2 <= n; x2++) {
                    for (int y2 = y1 + 1; y2 <= n; y2++) {
                        int width = x2 - x1;
                        int height = y2 - y1;
                        int curArea = width * height;

                        if (curArea >= area) {
                            System.out.printf("(%d, %d) (%d, %d) -> %d%n",
                                    x1, y1, x2, y2, curArea);
                            hasArea = true;
                        }
                    }
                }
            }
        }
        if (!hasArea) {
            System.out.println("No");
        }
    }
}