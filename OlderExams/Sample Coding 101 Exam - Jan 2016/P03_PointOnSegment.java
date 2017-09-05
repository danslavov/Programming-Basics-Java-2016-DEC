import java.util.Scanner;

public class P03_PointOnSegment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int x = scanner.nextInt();

        if (x >= Math.min(first, second) && x <= Math.max(first, second)) {
            System.out.println("in");
        } else {
            System.out.println("out");
        }
        System.out.println(Math.min(Math.abs(x - first), Math.abs(x - second)));
    }
}