package Clazzes;

public class Box {
    double width;
    double height;
    double depth;
    double volume;


    public double getVolume(double depth, double width, double height) {
        return depth * width * height;
    }

//    public static void main(String[] args) {
//        Box mybox = new Box();
//        mybox.depth = 5.5;
//        mybox.width = 5.5;
//        mybox.height = 5.5;
//
//        double volume = mybox.getVolume(mybox.depth, mybox.width, mybox.height);
//        System.out.println("your box volume is" + " " + volume);
//    }

}
