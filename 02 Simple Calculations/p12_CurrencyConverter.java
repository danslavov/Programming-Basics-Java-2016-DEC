import java.util.Scanner;

public class p12_CurrencyConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double inputAmount = Double.parseDouble(console.nextLine());
        String inputCurrency = console.nextLine();
        String outputCurrency = console.nextLine();
        double outputAmount = 1;

        if (inputCurrency.equals("BGN")) {
            if (outputCurrency.equals("USD")) {
                outputAmount = inputAmount * 0.5569510271                        ;
            } else {
                if (outputCurrency.equals("EUR")) {
                    outputAmount = inputAmount * 0.511291881;
                } else {
                    if (outputCurrency.equals("GBP")) {
                        outputAmount = inputAmount * 0.394625205;
                    }
                }
            }
        } else {
            if (inputCurrency.equals("USD")) {
                if (outputCurrency.equals("BGN")) {
                    outputAmount = inputAmount * 1.79549;
                } else {
                    if (outputCurrency.equals("EUR")) {
                        outputAmount = inputAmount * 0.91801946;
                    } else {
                        if (outputCurrency.equals("GBP")) {
                            outputAmount = inputAmount * 0.708545609;
                        }
                    }
                }
            }
            else {
                if (inputCurrency.equals("EUR")) {
                    if (outputCurrency.equals("BGN")) {
                        outputAmount = inputAmount * 1.95583;
                    } else {
                        if (outputCurrency.equals("USD")) {
                            outputAmount = inputAmount * 1.089301528;
                        } else {
                            if (outputCurrency.equals("GBP")) {
                                outputAmount = inputAmount * 0.771819814;
                            }
                        }
                    }
                }
                else {
                    if (inputCurrency.equals("GBP")) {
                        if (outputCurrency.equals("BGN")) {
                            outputAmount = inputAmount * 2.53405;
                        } else {
                            if (outputCurrency.equals("USD")) {
                                outputAmount = inputAmount * 1.411341751;
                            } else {
                                if (outputCurrency.equals("EUR")) {
                                    outputAmount = inputAmount * 1.295639192;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.printf("%.2f", outputAmount);
    }
}