import java.util.Scanner;

public class p16_Number0to100toText {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        int tens = num / 10;
        int units = num % 10;
        String textTens = "";
        String textUnits = "";

        if (tens == 2)
            textTens = "twenty";
        if (tens == 3)
            textTens = "thirty";
        if (tens == 4)
            textTens = "forty";
        if (tens == 5)
            textTens = "fifty";
        if (tens == 6)
            textTens = "sixty";
        if (tens == 7)
            textTens = "seventy";
        if (tens == 8)
            textTens = "eighty";
        if (tens == 9)
            textTens = "ninety";

        if (units == 0)
            textUnits = "zero";
        if (units == 1)
            textUnits = "one";
        if (units == 2)
            textUnits = "two";
        if (units == 3)
            textUnits = "three";
        if (units == 4)
            textUnits = "four";
        if (units == 5)
            textUnits = "five";
        if (units == 6)
            textUnits = "six";
        if (units == 7)
            textUnits = "seven";
        if (units == 8)
            textUnits = "eight";
        if (units == 9)
            textUnits = "nine";

        if (num == 100) {
            System.out.println("one hundred");
        } else if (num < 0 || num > 100) {
            System.out.println("invalid number");
        } else if (num < 10) {
            System.out.println(textUnits);
        } else if (num == 10) {
            System.out.println("ten");
        } else if (num == 11) {
            System.out.println("eleven");
        } else if (num == 12) {
            System.out.println("twelve");
        } else if (num == 13) {
            System.out.println("thirteen");
        } else if (num == 14) {
            System.out.println("fourteen");
        } else if (num == 15) {
            System.out.println("fifteen");
        } else if (num == 16) {
            System.out.println("sixteen");
        } else if (num == 17) {
            System.out.println("seventeen");
        } else if (num == 18) {
            System.out.println("eighteen");
        } else if (num == 19) {
            System.out.println("nineteen");
        } else if (units == 0) {
            System.out.println(textTens);
        } else {
            System.out.println(textTens + " " + textUnits);
        }
    }
}
