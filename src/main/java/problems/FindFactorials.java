package problems;

public class FindFactorials {
    /**
     * factorials of n n! = 1 * 2 * 3 * ......* n
     * */

    static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(
                "Factorial of " + num
                        + " is " + factorial(5));
    }
}