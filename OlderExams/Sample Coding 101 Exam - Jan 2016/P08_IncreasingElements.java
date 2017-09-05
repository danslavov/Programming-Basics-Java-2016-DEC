import java.util.Scanner;

public class P08_IncreasingElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int curSeries = 0;
        int series = 1;
        int prevNum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int curNum = scanner.nextInt();

            if (curNum > prevNum) {
                curSeries++;
            } else {
                curSeries = 1;
            }

            if (curSeries > series) {
                series = curSeries;
            }
            prevNum = curNum;
        }
        System.out.println(series);
    }
}
