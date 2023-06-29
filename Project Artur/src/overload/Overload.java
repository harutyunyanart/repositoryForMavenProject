package overload;

public class Overload {

    public void overloadedMethod(){
        System.out.println("version 1");
    }
    public void overloadedMethod(int i){
        System.out.println("version " + i);
    }
    public void overloadedMethod(int i, double i2){
        System.out.println("version " + i + " " + i2);
    }
    public void overloadedMethod(double i2, int i){
        System.out.println("version " + i + " " + i2);
    }
    public String overloadedMethod(String s){
        System.out.println("version " + s);
        return "kuku";
    }

    // DO NOT ACTIVATE
//    public void overloadedMethod(String s){
//        System.out.println("version " + s);
//    }



}
