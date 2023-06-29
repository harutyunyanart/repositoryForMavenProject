package arrays;


/**
 * This class contains utility methods for array
 * manipulation.
 */
public class ArrayUtil {


    /**
     * Sorts the array elements by odd and even number
     * such that if first number is odd then second must be even number
     * this means that it will be found the next even number and swap with the second element
     * if the second element is odd. And so on for the next elements of the array
     */
    public void sortByOddAndEven(int[] array) {

        // use the swap method to swap  two elements with i and j indexes  of the specified  Array. 
    }

    public static int getMaximum(int[] array) {
//        TODO   implement
        return 0;   // this must be replaced by correct code
    }


    public static int getMinimum(int[] array) {
//        TODO implement
        return 0;   // this must be replaced by correct code
    }

    /**
     * Calculates the sum of specified <code>array</code>  elements
     *
     * @param array specified int array
     * @return the sum of the specified array elements
     */
    public static int getSum(int[] array) {
//        TODO implement
        return 0;   // this must be replaced by correct code
    }

    public static int[] reverse(int[] array) {
//        TODO implement
        return null;   // this must be replaced by correct code
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    /**
     * Prints all elements in an array.
     *
     * @param a the array to print
     */
    public static void print(int[] a) {
        String val="";
        for (int i = 0; i < a.length; i++) {
           val+=a[i];
        }
        System.out.print(val);
        // todo implement
    }
}
      
