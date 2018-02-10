import java.util.Scanner;

public class p12_SpeedInfo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double speed = Double.parseDouble(console.nextLine());

        if(speed <= 10) {
            System.out.println("slow");
        }
        if(speed > 10 && speed <= 50) {
            System.out.println("average");
        }
        if(speed > 50 && speed <= 150) {
            System.out.println("fast");
        }
        if(speed > 150 && speed <= 1000) {
            System.out.println("ultra fast");
        }
        if(speed > 1000) {
            System.out.println("extremely fast");
        }
    }
}
