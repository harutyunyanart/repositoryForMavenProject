package classes;

public class Human {

    String name;
    String surname;
    int age;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    Human(String name, String surname){
        this(name, surname, 0);
    }

    Human(){}

    public void changeAge(int age){
        age++;
    }
    public void changeAge(){
        age++;
    }
    public void changeAge(Human human){
        human = new Human();
    }

}
