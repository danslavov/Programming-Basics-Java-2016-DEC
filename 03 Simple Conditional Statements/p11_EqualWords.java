import java.util.Scanner;

public class p11_EqualWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String word1 = console.nextLine().toLowerCase(); //.toLowerCase() за да не се прави разлика между главни и малки букви
        String word2 = console.nextLine().toLowerCase();

        if (word1.equals(word2)) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
