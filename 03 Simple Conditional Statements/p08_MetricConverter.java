import java.text.DecimalFormat;
import java.util.Scanner;

public class p08_MetricConverter {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("#.#######"); //позволява да задаваш колко значещи символа да има след десетичния разделител
        Scanner console = new Scanner(System.in);
        double num = Double.parseDouble(console.nextLine());
        String in = console.nextLine();
        String out = console.nextLine();

//първо превръщаме num в метри

        if(in.equals("mm")) {
            num = num / 1000;
        }
        if(in.equals("cm")) {
            num = num / 100;
        }
        if(in.equals("mi")) {
            num = num / 0.000621371192;
        }
        if(in.equals("in")) {
            num = num / 39.3700787;
        }
        if(in.equals("km")) {
            num = num / 0.001;
        }
        if(in.equals("ft")) {
            num = num / 3.2808399;
        }
        if(in.equals("yd")) {
            num = num / 1.0936133;
        }

        if(out.equals("mm")) {
            num = num * 1000;
        }
        if(out.equals("cm")) {
            num = num * 100;
        }
        if(out.equals("mi")) {
            num = num * 0.000621371192;
        }
        if(out.equals("in")) {
            num = num * 39.3700787;
        }
        if(out.equals("km")) {
            num = num * 0.001;
        }
        if(out.equals("ft")) {
            num = num * 3.2808399;
        }
        if(out.equals("yd")) {
            num = num * 1.0936133;
        }

        System.out.println(format.format(num) + " " + out);
    }
}