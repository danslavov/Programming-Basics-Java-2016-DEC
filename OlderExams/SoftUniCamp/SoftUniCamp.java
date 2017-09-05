import java.util.Scanner;

public class SoftUniCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupNumber = Integer.parseInt(scanner.nextLine());
        int car = 0;
        int busMicro = 0;
        int busSmall = 0;
        int busBig = 0;
        int train = 0;

        for (int i = 0; i < groupNumber; i++) {
            int studentsInGroup = Integer.parseInt(scanner.nextLine());
            boolean isCar = studentsInGroup <= 5;
            boolean isBusMicro = studentsInGroup >= 6 && studentsInGroup <= 12;
            boolean isBusSmall = studentsInGroup >= 13 && studentsInGroup <= 25;
            boolean isBusBig = studentsInGroup >= 26 && studentsInGroup <= 40;
            boolean isTrain = studentsInGroup > 40;

            if (isCar) {
                car += studentsInGroup;
            }
            if (isBusMicro) {
                busMicro += studentsInGroup;
            }
            if (isBusSmall) {
                busSmall += studentsInGroup;
            }
            if (isBusBig) {
                busBig += studentsInGroup;
            }
            if (isTrain) {
                train += studentsInGroup;
            }
        }

        double studentsAll = car + busMicro + busSmall + busBig + train;
        double carPercent = (car / studentsAll) * 100;
        double busMicroPercent = (busMicro / studentsAll) * 100;
        double busSmallPercent = (busSmall / studentsAll) * 100;
        double busBigPercent = (busBig / studentsAll) * 100;
        double trainPercent = (train / studentsAll) * 100;

        System.out.printf("%.02f%%%n%.02f%%%n%.02f%%%n%.02f%%%n%.02f%%%n",
                carPercent, busMicroPercent, busSmallPercent, busBigPercent, trainPercent);
    }
}