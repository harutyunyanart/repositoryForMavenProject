package Arraysss;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] array = {25, 25, 10};
        System.out.println(getResult(array));


    }

    public static int getResult(int[] a) {
        int val=0;
        for (int i = 0; i < a.length; i++) {
            val +=a[i];
        }
        return val;
    }


}

