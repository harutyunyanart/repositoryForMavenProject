package mathut;


/**
 * Encapsulates the mathematical functions
 */
public class MathUtil {

    /**
     * Returns the value of the first argument raised to the power of the
     * second argument, such that a > 0 and n > 0.
     *
     * @param a the base
     * @param n the exponent
     * @return the value <code>a<sup>b</sup></code>.
     */
    public static int raiseToPower(int number, int degree) {
        int x = 1;
        if (number > 0 && degree > 0) {
            for (int i = 0; i < degree; i++) {
                x *= number;
            }
        } else System.out.println("number: " + number + " and degree: " + degree + " should be > 0");
        return x;
    }

    /**
     * Calculates and returns Greatest common divisor
     *
     * @param x
     * @param y
     * @return gcd of specified x and y numbers
     */
    public static int gcd(int x, int y) {
        int n = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0) {
                n = i;
            }
        }

        return n;
    }


    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static int factorial(int n) {

        if (n == 0 || n == 1) {
            System.out.println("the factorial of number 0 and 1 is " + 1);
            return 1;
        }
        if (n < 0) {
            System.out.println(" negative integer factorials are undefined.");
        }
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        if (n < 0) {
            n = n * (-1);
        }
        return n;
    }

    /**
     * Reverses the specified "number" parameter by digits.
     *
     * @param number the parameter to be revered
     * @return reversed number
     */
    public static int reverse(int number) {
        int n = 0;
        int x = number;
        String str = "";
        if (number < 10) {
            return number;
        }
        while (x > 0) {
            n = x % 10;
            x = x / 10;
            str = str + n;
        }
        return Integer.parseInt(str);
    }
}
