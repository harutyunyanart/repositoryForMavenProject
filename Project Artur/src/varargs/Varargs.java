package varargs;

public class Varargs {

    public static void varargsMethod(int ii, int ... numbers){
        System.out.println(numbers.length);
        for(int i : numbers){
            System.out.println(i);
        }
    }
    public static void varargsMethod(int i){}

}
