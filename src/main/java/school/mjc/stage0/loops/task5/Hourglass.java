package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        boolean check = true;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i < height - i) {
                    if (i <= j && j < height - i) {
                        System.out.print("8");
                        continue;
                    }
                } else {
                    if (height - i -1 <= j && j < i+1) {
                        System.out.print("8");
                        continue;
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
