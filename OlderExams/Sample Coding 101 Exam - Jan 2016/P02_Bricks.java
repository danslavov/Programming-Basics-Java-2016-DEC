import java.util.Scanner;

public class P02_Bricks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int brickCount = Integer.parseInt(scanner.nextLine());
        int workerCount = Integer.parseInt(scanner.nextLine());
        int cartCapacity = Integer.parseInt(scanner.nextLine());
        int courses = brickCount / (workerCount * cartCapacity);
        if (brickCount % (workerCount * cartCapacity) != 0) {
            courses++;
        }
        System.out.println(courses);
    }
}