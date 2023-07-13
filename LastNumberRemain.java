/*Question[2]------You have a list `arr` of all integers in the range `[1, n]` sorted in a strictly increasing order. Apply the following algorithm on `arr`:

- Starting from left to right, remove the first number and every other number afterward until you reach the end of the list.
- Repeat the previous step again, but this time from right to left, remove the rightmost number and every other number from the remaining numbers.
- Keep repeating the steps again, alternating left to right and right to left, until a single number remains.

Given the integer `n`, return *the last number that remains in* `arr`.      
Input: n=9                                                           Input: n = 9
Output: 6
Explanation:
arr = [1, 2,3, 4,5, 6,7, 8,9]
arr = [2,4, 6,8]
arr = [2, 6]
arr = [6]
*/
import java.util.ArrayList;
import java.util.List;

public class LastNumberRemain {
    public static int lastRemaining(int n) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }

        boolean leftToRight = true;
        while (arr.size() > 1) {
            if (leftToRight) {
                for (int i = 0; i < arr.size(); i += 2) {
                    arr.remove(i);
                }
            } else {
                for (int i = arr.size() - 1; i >= 0; i -= 2) {
                    arr.remove(i);
                }
            }
            leftToRight = !leftToRight;
        }

        return arr.get(0);
    }

    public static void main(String[] args) {
        int n = 9;
        int result = lastRemaining(n);
        System.out.println(result);
    }
}
