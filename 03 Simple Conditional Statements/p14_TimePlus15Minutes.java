import java.util.Scanner;

public class p14_TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int hr = Integer.parseInt(console.nextLine());
        int min = Integer.parseInt(console.nextLine());
        min += 15;

        if(min > 59) {
            min -= 60;
            hr += 1;
        }
        if(hr > 23) {
            hr = 0;
        }
        System.out.printf("%d:%02d", hr, min);
    }
}
