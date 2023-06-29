package Bubble;

public class BubbleSortTest {
    public static void main(String[] args) {
        int [] array ={21,12,45,68,5,-1,0,5,3};
       BubbleSort ob =new BubbleSort();
       ob.bubbleSorting(array);
       BubbleSort.printArray(array);
    }
}
