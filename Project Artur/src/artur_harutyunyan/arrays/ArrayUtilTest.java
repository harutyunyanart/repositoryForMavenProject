package artur_harutyunyan.arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        int [] arr ={4,5,40,7,48,75};
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.sortByOddAndEven(arr);

        int y = ArrayUtil.getMaximum(arr);
        System.out.println(y);
        //ArrayUtil.print(arr);
        int  i = ArrayUtil.getMinimum(arr);
        System.out.println(i);
        System.out.println(ArrayUtil.getMinimum(arr));
        ArrayUtil.print(arr);
       // System.out.println(arr);
       int []   a = ArrayUtil.reverse(arr);
        ArrayUtil.print(a);
       int g =  ArrayUtil.getSum(arr);
        System.out.println(g);

        // todo complete the code
       // Call all methods of ArrayUtil class to test them
    }
}