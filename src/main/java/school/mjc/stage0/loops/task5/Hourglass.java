package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height / 2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < height - 2 * i; j++) {
                System.out.print("8");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        int middleOfFigure;

        if (height % 2 == 0)
            middleOfFigure = height / 2 - 1;
        else
            middleOfFigure = height / 2;

        for (int i = middleOfFigure; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < height - 2 * i; j++) {
                System.out.print("8");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
