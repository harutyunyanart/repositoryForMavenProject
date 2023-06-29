package Clazzes;

public class Stack {
    public static final int DEFAULT_CAPACITY = 16;
    int array[];
    int tos;
    public Stack(int capacity) {
        this.array = new int[capacity];
        this.tos = -1;
    }

    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    public int pop() {
        return array[tos--];
    }

    public int peek(){return array[tos];}

    public void push(int i) {
        array[++tos] = i;
        if (tos == array.length - 1) {
            extend();
        }
    }

    public boolean isEmpty() {
        return tos < 0;
    }

    public void extend() {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];

        }
        array = newArray;
    }

}
