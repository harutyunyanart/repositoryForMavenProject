package generic;

public class MyGenericTest {
    public static void main(String[] args) {
        MyGeneric<String> MyGenericString = new MyGeneric<>();
        MyGenericString.setContents("Hy beybe");
        System.out.println(MyGenericString.getContents());

        MyGeneric<Integer> MyGenericInteger = new MyGeneric<>();
        MyGenericInteger.setContents(45);
        System.out.println(MyGenericInteger.getContents());

        MyGeneric<Number> MyGenericChar = new MyGeneric<Number>();

        MyGeneric<Double> MyGenericDouble = new MyGeneric<Double>();
        MyGenericDouble.setContents(5.8);
        System.out.println(MyGenericDouble.getContents());
    }
}
