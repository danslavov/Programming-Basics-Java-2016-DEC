import java.util.Scanner;

public class tmp {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);

        int n = Integer.parseInt(console.nextLine());
        String A = "*";
        for(int i=1; i<=n-1; i++){
            A += "*";
        }
        String B = "*";
        for(int j=1; j<=n-2; j++){
        }
        System.out.println(A);
    }
}