package classes.otherPackage;

import classes.Box;
import overload.Overload;

public class OtherClass {
    public static void main(String[] args) {
        Box box = new Box(12,13,24);
        Overload overload = new Overload();
        overload.overloadedMethod();
    }
}
