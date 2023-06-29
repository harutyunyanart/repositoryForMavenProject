package generics;

public class BoundedTypesDemo {
    public static void main(String[] args) {
        Integer[] integers = new Integer[8];
        for (int i = 0; i <integers.length; i++) {
            integers[i] = i;
        }
        Statistics<Integer> statistics = new Statistics<>(integers);
        System.out.println(statistics.getAverage());


        Double[] doubles = new Double[8];
        for (int i = 0; i <doubles.length; i++) {
            doubles[i] = (double)i;
        }
        Statistics<Double> doublesStatistics = new Statistics<>(doubles);
        System.out.println(doublesStatistics.getAverage());

//        String[] strings = new String[8];
//        for (int i = 0; i <integers.length; i++) {
//            strings[i] = ""+i;
//        }
        Statistics<Number> statistics2 = new Statistics<>(integers);
        System.out.println(statistics2.getAverage());
        System.out.println(statistics.sameAverage(doublesStatistics));

    }
}
