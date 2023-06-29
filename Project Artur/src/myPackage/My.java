package myPackage;
import javax.swing.*;
public class My {
    public static void main(String[] args) {
        My.createSpiral(5);
    }
        public static void createSpiral(int n) {
            int[][] spiral = new int[n][n];
            int value = 1;
            int minRow = 0, maxRow = n - 1, minCol = 0, maxCol = n - 1;

            while (value <= n * n) {
                // Fill top row
                for (int i = minCol; i <= maxCol; i++) {
                    spiral[minRow][i] = value++;
                }
                minRow++;

                // Fill right column
                for (int i = minRow; i <= maxRow; i++) {
                    spiral[i][maxCol] = value++;
                }
                maxCol--;

                // Fill bottom row
                for (int i = maxCol; i >= minCol; i--) {
                    spiral[maxRow][i] = value++;
                }
                maxRow--;

                // Fill left column
                for (int i = maxRow; i >= minRow; i--) {
                    spiral[i][minCol] = value++;
                }
                minCol++;
            }

            // Print the spiral
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(spiral[i][j] + "\t");
                }
                System.out.println();
            }
        }

    }

