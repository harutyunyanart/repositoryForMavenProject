package RescursionUtil;

public class MathUtilRecursion {
    /**
     * Returns the value of the first argument raised to the power of the
     * second argument, such that a > 0 and n > 0.
     *
     * @param a the base
     * @param n the exponent
     * @return the value <code>a<sup>b</sup></code>.
     */
    public static int raiseToPower(int number, int degree) {
        if (degree == 0) {
            return 1;
        }

        return number * raiseToPower(number, degree - 1);
    }

    public static int reverse(int number) {
        int n = 0;
        int x = number;
        String str = "";
        if (number < 10) {
            return number;
        }

        n = x % 10;
        x = x / 10;
        str = str + n;

        return Integer.parseInt(str += reverse(x));
    }
}

