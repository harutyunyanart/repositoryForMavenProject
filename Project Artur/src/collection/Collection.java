package collection;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List<Object> a = new ArrayList<>();


        a.add(5);
        a.add('6');
        a.add("nhjhjjhjh");
        a.add(8.858);
        a.add(true);

        System.out.println(a);
        a.remove(1);
        System.out.println("after removing");
        System.out.println(a);
        a.set(1,555);
        System.out.println(a);


    }
}
