package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

    public static void main(String[] args) {
        MyNonGeneric myNonGenericInteger = new MyNonGeneric(12);
        MyNonGeneric myNonGenericString = new MyNonGeneric("dfg");

        myNonGenericString.setValue(54);
        myNonGenericString.add("sdgsdg");
        Object value = myNonGenericString.getValue();
        if(value instanceof String) {
            String s = (String)value;
            System.out.println(s.charAt(0));
        }




        List<Integer> integers = new ArrayList<>();
        MyGeneric<Integer> myInteger = new MyGeneric<>(45);
        MyGeneric<Number> myNumber = new MyGeneric<>(45);
        MyGeneric<String> myString = new MyGeneric<>("dsf");
//        MyGeneric myGeneric = new MyGeneric<>(45);

        myInteger.setValue(12);
        int i = myInteger.getValue();
        myNumber.setValue(i);

        myString.setValue("some text");
        String s = myString.getValue();
//        myString = myInteger;
//        myNumber = myInteger;
//        myInteger = myNumber;
//        myString = myGeneric;
    }

}
