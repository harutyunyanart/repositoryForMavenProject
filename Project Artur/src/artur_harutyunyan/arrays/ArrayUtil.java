package artur_harutyunyan.arrays;


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
        /** int [] odd=new int[array.length];
         int [] even = new int [array.length];
         for (int i = 0; i < array.length ; i++) {
         if (array[i] % 2 == 0) {
         even[i] = array[i];
         }
         else {
         odd[i] = array[i];
         }
         }
         print(even);
         print(odd);**/

        int length = array.length;
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++)
                if (array[j] % 2 ==0) {
                    swap(array, j, j + 1);
                }
        print(array);

        // use the swap method to swap  two elements with i and j indexes  of the specified  Array. 
    }


    public static int getMaximum(int[] array) {
//        TODO   implement
        int length = array.length;
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }

        return array[length - 1];   // this must be replaced by correct code
    }


    public static int getMinimum(int[] array) {
//        TODO implement
        int length = array.length;
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }

        return array[0];   // this must be replaced by correct code
    }

    /**
     * Calculates the sum of specified <code>array</code>  elements
     *
     * @param array specified int array
     * @return the sum of the specified array elements
     */
    public static int getSum(int[] array) {
//        TODO implement
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + i;
        }
        return result;   // this must be replaced by correct code
    }

    public static int[] reverse(int[] array) {
//        TODO implement
        int[] reversedArray = new int[array.length];
        int a = array.length;
        for (int i = 0; i < array.length; i++) {
            reversedArray[a - 1] = array[i];
            a = a - 1;
        }


        return reversedArray;   // this must be replaced by correct code
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
        // todo implement
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + ",");
        }
        System.out.println("]");
    }
}
      
