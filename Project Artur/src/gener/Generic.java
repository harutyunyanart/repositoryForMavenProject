package gener;

public class Generic {
    public static void main(String[] args) {
        Integer[] a = {5, 5};
        print(a);
    }

    static <T> void print(T[] array) {
        for (T a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
