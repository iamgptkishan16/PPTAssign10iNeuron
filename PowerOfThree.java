/*Question[1]----Given an integer `n`, return *`true` if it is a power of three. Otherwise, return `false`*.

An integer `n` is a power of three, if there exists an integer `x` such that `n == 3x`.
Example 1: Input: n = 27
Output: true
Explanation: 27 = 33*/


public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        int n = 27;
        boolean result = isPowerOfThree(n);
        System.out.println(result);
    }
}
