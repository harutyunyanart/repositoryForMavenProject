package classes;

public class Box {

    {
        System.out.println(this.width);
    }
    int width = 5;
    int height = 5;
    int length = 5;

    {
        System.out.println(this.width);
    }

    Box(Box box){
        this(box.width, box.height, box.length);
    }
    public Box(int width, int height, int length){
        System.out.println("in constructor");
        this.width = width;
        this.length = length;
        this.height = height;
    }
    public int getVolume(){
        return width * height * length;
    }

}
