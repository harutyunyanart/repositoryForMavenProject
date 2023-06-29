package RescursionUtil;

public class ArrayUtilTest {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 4, 5};
        int max = ArrayUtil.getMax(arr, arr.length);
        System.out.println("Maximum element: " + max);
        int min = ArrayUtil.getMin(arr, arr.length);
        System.out.println("Minimum element: " + min);
        System.out.println("sum is" + " " + ArrayUtil.getSum(arr, arr.length));
        ArrayUtil.print(ArrayUtil.reverse(arr, 0, arr.length - 1));

    }

}
