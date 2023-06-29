package generics;

public class Statistics <N extends Number> {
    private N[] numbers;

    public Statistics(N[] numbers) {
        this.numbers = numbers;
    }

    public double getAverage(){
        double result = 0;
        for (N number : numbers){
            result += number.doubleValue();
        }
        return result/numbers.length;
    }

    public boolean sameAverage(Statistics<?> other){
        return getAverage() == other.getAverage();
    }
}
