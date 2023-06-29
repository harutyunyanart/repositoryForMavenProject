package Artur;

public class getMin {
    public static void main(String[] args) {
        int[] array = {4, 78, 65, 25, 9, 2};
        System.out.println(getMin.getArrayMinValue(array));
    }

    public static int getArrayMinValue(int[] array) {
        int getmin = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i; j++) {
               swap(array, i, j);


            }
        }
        return 0;
    }

    public static void swap(int[] arr, int num1, int num2) {

        for (int i = 0; i < arr.length; i++) {
             int array= arr[num1];
            num1 = num2;
            num2 = array;
            System.out.println(array);
        }

    }
}
