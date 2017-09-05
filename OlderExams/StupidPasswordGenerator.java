import java.util.Scanner;

public class StupidPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());    // n
        int num2 = Integer.parseInt(scanner.nextLine());    // l

        int sym1 = 0;
        int sym2 = 0;
        String sym3 = "";
        String sym4 = "";
        int sym5 = 0;

        for (sym1 = 1; sym1 < num1; sym1++) {
            for (sym2 = 1; sym2 < num1; sym2++) {
                for (int k = 1; k <= num2; k++) {
                    switch (k) {
                        case 1:
                            sym3 = "a";
                            break;
                        case 2:
                            sym3 = "b";
                            break;
                        case 3:
                            sym3 = "c";
                            break;
                        case 4:
                            sym3 = "d";
                            break;
                        case 5:
                            sym3 = "e";
                            break;
                        case 6:
                            sym3 = "f";
                            break;
                        case 7:
                            sym3 = "g";
                            break;
                        case 8:
                            sym3 = "h";
                            break;
                        case 9:
                            sym3 = "i";
                            break;
                    }
                    for (int l = 1; l <= num2; l++) {
                        switch (l) {
                            case 1:
                                sym4 = "a";
                                break;
                            case 2:
                                sym4 = "b";
                                break;
                            case 3:
                                sym4 = "c";
                                break;
                            case 4:
                                sym4 = "d";
                                break;
                            case 5:
                                sym4 = "e";
                                break;
                            case 6:
                                sym4 = "f";
                                break;
                            case 7:
                                sym4 = "g";
                                break;
                            case 8:
                                sym4 = "h";
                                break;
                            case 9:
                                sym4 = "i";
                                break;
                        }
                        for (sym5 = Math.max(sym1, sym2) + 1; sym5 <= num1; sym5++) {
                            System.out.printf("%d%d%s%s%d ", sym1, sym2, sym3, sym4, sym5);
                        }
                    }
                }
            }
        }
    }
}