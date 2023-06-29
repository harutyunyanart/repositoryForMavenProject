package spiral;

public class spiral {

    public static void main(String[] args) {
        spiral.printSpiral(5);
    }

    public static void printSpiral(int n) {
        int[][] spiral = new int[n][n];
        int value = 1;
        int minRow = 0;
        int maxRow = n - 1;
        int minColum = 0;
        int maxColum = n - 1;
        while (value <= n * n) {
            for (int i = minColum; i <= maxColum; i++) {
                spiral[minRow][i] = value++;
            }
            minRow++;

            for (int i = minRow; i <= maxRow; i++) {
                spiral[i][maxColum] = value++;
            }
            maxColum--;

            for (int i = maxColum; i >= minColum; i--) {
                spiral[maxRow][i] = value++;
            }
            maxRow--;

            for (int i = maxRow; i >= minRow; i--) {
                spiral[i][minColum] = value++;
            }
            minColum++;


        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(spiral[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
