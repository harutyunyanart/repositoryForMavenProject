package Sorting;

public class InsertionSort {
    void insertionSorting(int[] arr) {
        int i;

        int n = arr.length;
        for (i = 1; i < n; i++) {
            int j = i - 1;
            while (arr[i] < arr[j]) {
                swap(arr, i, j);
                j--;
            }

        }


    }


    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
