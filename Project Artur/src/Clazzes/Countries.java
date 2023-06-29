package Clazzes;

public class Countries {
    String name;
    double area;
    double population;


    public static void main(String[] args) {
        Countries Armenia = new Countries();
        Countries Argentina = new Countries();


        Armenia.name = "Armenia";
        Armenia.area = 29750;
        Armenia.population = 3200000;
        System.out.println("the name of the country is" + " " + Armenia.name);
        System.out.println("the territory of the country is" + " " + Armenia.area);
        System.out.println(" the population of the country is" + " " + Armenia.population);
    }
}
