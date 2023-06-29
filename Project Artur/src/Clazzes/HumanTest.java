package Clazzes;

public class HumanTest {
    static Box mybox = new Box();
    static Car mycar = new Car();
    static Human human = new Human();


    public static void main(String[] args) {
        mybox.width = 2.5;
        mybox.height = 2.5;
        mybox.depth = 2.5;
        mybox.volume = mybox.getVolume(mybox.depth, mybox.width, mybox.height);
        mycar.name = "ferrari";
        mycar.horsePower = 753;
        mycar.color = "red";
        human.name = "Rodrigo";
        human.surname = " Bentankur";
        human.age = 35;
        human.isWorked = true;
        human.salary = 17500;
        human.car = mycar;
        human.iswhere= "Ijevan";

//        System.out.println("name"+" "+human.name);
//        System.out.println("surname"+" "+human.surname);
//        System.out.println("age"+" "+human.age);
//        System.out.println("car"+" "+human.car.name);

        System.out.println(human.name);
        System.out.println(human.surname);
        System.out.println(human.age);
        System.out.println("Married or no-"+" "+human.isMarried);

    }
}
