package staticNonStatic;

public class StaticClassTemp {
public  int a=5;
    public static void main(String[] args) {
        StaticClass.method1();
        StaticClass newStaticClass = new StaticClass();
        newStaticClass.method2();


    }

}
