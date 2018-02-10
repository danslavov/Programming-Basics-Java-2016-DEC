import java.util.Scanner;

public class P04_FruitorVegetable {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        String product = console.nextLine();
        String result = "";
        switch(product) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                result = "fruit";
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                result = "vegetable";
                break;
            default:
                result = "unknown";
                break;
        }
        System.out.println(result);
    }
}
