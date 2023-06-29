package Examples;

public class Task {
    public static void main(String[] args) {
        int[] mainArray = {56, 15, 23, 99};
        int[] sumArray = new int[mainArray.length];
        int[] tempForMax = new int[mainArray.length];
        int length = sumArray.length;
        for (int i = 0; i < mainArray.length; i++) {
            sumArray[i] = mainArray[i] / 10 + mainArray[i] % 10;
            tempForMax[i] = sumArray[i];
        }
        sort(sumArray, length);
        int index = -1;
        index = getIndex(sumArray, tempForMax, length, index);
        System.out.println("MaxSum: " + sumArray[length - 1]);
        System.out.println("number: " + mainArray[index]);
    }

    private static int getIndex(int[] sumArray, int[] tempForMax, int length, int index) {
        for (int i = 0; i < tempForMax.length; i++) {
            if (tempForMax[i] == sumArray[length - 1]) {
                index = i;
            }
        }
        return index;
    }

    private static void sort(int[] sumArray, int length) {
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++)
                if (sumArray[j] > sumArray[j + 1]) {
                    swap(sumArray, j, j + 1);
                }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
