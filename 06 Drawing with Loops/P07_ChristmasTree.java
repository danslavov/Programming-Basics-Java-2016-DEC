import java.util.Scanner;

public class P07_ChristmasTree {
    public static String repeatStr (String text, int count) {
        String output = "";
        for (int i = 0; i < count; i++) {
            output += text;
        }
        return output;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(repeatStr(" ", n + 1) + "|");
        for (int i = 0; i < n; i++) {
            String stars = repeatStr("*", i + 1);
            String spaces = repeatStr(" ", n - 1 - i);
            System.out.println(spaces + stars + " | " + stars);
            
        }
    }
}
