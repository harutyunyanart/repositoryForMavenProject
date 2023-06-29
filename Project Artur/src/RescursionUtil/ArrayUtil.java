package RescursionUtil;

public class ArrayUtil {
    static int getMax(int[] arr, int length) {
        if (length == 1)
            return arr[0];
        return max(getMax(arr, length - 1), arr[length - 1]);
    }

    private static int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }


    static int getMin(int[] arr, int length) {
        if (length == 1)
            return arr[0];
        return min(getMin(arr, length - 1), arr[length - 1]);
    }

    private static int min(int n1, int n2) {
        return n1 < n2 ? n1 : n2;
    }

    public static int[] reverse(int[] array, int leftIndex, int rightIndex) {

        if (leftIndex < rightIndex) {
            int temp;
            temp = array[leftIndex];
            array[leftIndex] = array[rightIndex];
            array[rightIndex] = temp;
            reverse(array, leftIndex + 1, rightIndex - 1);
        }

        return array;
    }
    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
    public static int getSum(int[] array, int n) {

        if (n <= 0) {
            return 0;
        }
        return getSum(array, n - 1) + array[n - 1];
    }


}
