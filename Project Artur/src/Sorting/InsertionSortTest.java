package Sorting;

public class InsertionSortTest {
    public static void main(String[] args) {

        int[] array = {10, 20, 32, 5};

        InsertionSort ob = new InsertionSort();
        ob.insertionSorting(array);
        InsertionSort.printArray(array);
    }
}
