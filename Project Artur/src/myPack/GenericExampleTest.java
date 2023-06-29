package myPack;

public class GenericExampleTest {
    public static void main(String[] args) {
        GenericExample<Integer> myGenericExample = new GenericExample<>();
        myGenericExample.setContents(588);
        System.out.println(myGenericExample.getContents());


    }


}
