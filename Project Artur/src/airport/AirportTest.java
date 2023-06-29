package airport;

public class AirportTest {
    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }

    public static int getFactorial(int n){
       int count =1;
        for (int i = 1; i <=n ; i++) {
          count =count*i;
        }
        return count;
    }
}
