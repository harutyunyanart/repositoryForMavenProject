package BraceChecker;

public class Stack {
    char[] array;
    int tos;
    public static final int DEFAULT_CAPACITY = 16;

    public Stack(int capacity) {
        this.array = new char[capacity];
        this.tos = -1;
    }

    public Stack() {
        this(DEFAULT_CAPACITY);

    }

    boolean push(char symbol) {
        array[++tos] = symbol;

        if (tos == array.length - 1) {
            extend();
        }return array[tos] == symbol;
    }

    char pop() {
        return array[tos--];
    }


    int size() {
        return tos;
    }

    boolean isEmpty() {
        if (tos < 0) {
            return true;
        } else return false;
    }
    public int peek(){return array[tos];}
    private void extend() {
        char[] newArray = new char[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

}
