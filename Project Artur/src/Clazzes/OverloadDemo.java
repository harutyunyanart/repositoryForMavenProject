package Clazzes;

public class OverloadDemo {


    public static int getValue(int a,int b,int c){
        return  a*b*c;
    }

    public static void main(String[] args) {
        int h=5;
        int k = 5;
        int j = 5;
        System.out.println(getValue(h,k,j));
    }
}
