import java.util.Scanner;

public class P08_TradeComissions {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String city = console.nextLine().toLowerCase();
        double s = Double.parseDouble(console.nextLine());
        double commission = -1;
        boolean s1 = s >= 0 && s <= 500;
        boolean s2 = s > 500 && s <= 1000;
        boolean s3 = s > 1000 && s <= 10000;
        boolean s4 = s > 10000;

        switch (city) {
            case "sofia":
                if (s1) {
                    commission = 0.05;
                } else if (s2) {
                    commission = 0.07;
                } else if (s3) {
                    commission = 0.08;
                } else if (s4) {
                    commission = 0.12;
                }
                break;
            case "varna":
                if (s1) {
                    commission = 0.045;
                } else if (s2) {
                    commission = 0.075;
                } else if (s3) {
                    commission = 0.1;
                } else if (s4) {
                    commission = 0.13;
                }
                break;
            case "plovdiv":
                if (s1) {
                    commission = 0.055;
                } else if (s2) {
                    commission = 0.08;
                } else if (s3) {
                    commission = 0.12;
                } else if (s4) {
                    commission = 0.145;
                }
                break;

        }
        if (commission >= 0) {
            System.out.printf("%.2f", s * commission);
        } else {
            System.out.println("error");
        }
    }
}
