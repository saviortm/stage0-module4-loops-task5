package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (j == sideLength / 2 || i == sideLength / 2) {
                    System.out.print("8");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
