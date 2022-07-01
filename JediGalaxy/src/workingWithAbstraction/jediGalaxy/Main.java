package workingWithAbstraction.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int[] dimensions = toArray(scanner.nextLine());

            int row = dimensions[0];
            int column = dimensions[1];

            int[][] galaxy = new int[row][column];

        fillingGalaxy(row, column, galaxy);

        String command = scanner.nextLine();
            
            long collectedStars = 0;
            
            while (!command.equals("Let the Force be with you")) {

                int[] evilPosition = toArray(scanner.nextLine());
                int evilRow = evilPosition[0];
                int evilCol = evilPosition[1];

                while (evilRow >= 0 && evilCol >= 0) {

                    if (evilRow < galaxy.length && evilCol < galaxy[0].length) {

                        galaxy[evilRow] [evilCol] = 0;
                    }
                    evilRow--;
                    evilCol--;
                }

                int[] jediPosition = toArray(command);
                int jediRow = jediPosition[0];
                int jediCol = jediPosition[1];

                while (jediRow >= 0 && jediCol < galaxy[1].length) {

                    if (jediRow < galaxy.length && jediCol >= 0 && jediCol < galaxy[0].length) {
                        collectedStars += galaxy[jediRow][jediCol];
                    }
                    jediCol++;
                    jediRow--;
                }

                command = scanner.nextLine();
            }

        System.out.println(collectedStars);


    }

    private static void fillingGalaxy(int row, int column, int[][] galaxy) {
        int value = 0;

        for (int rows = 0; rows < row; rows++) {

            for (int columns = 0; columns < column; columns++) {

                galaxy[rows][columns] = value++;
            }
        }
    }

    private static int[] toArray(String s) {
        return Arrays.stream(s.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
