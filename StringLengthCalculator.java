/*Question[4]--Given a string calculate length of the string using recursion.

**Examples:** Input : str = "abcd"
Output :4

Input : str = "GEEKSFORGEEKS"
Output :13*/


public class StringLengthCalculator {
    public static int calculateLength(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        return 1 + calculateLength(str.substring(1));
    }

    public static void main(String[] args) {
        String str1 = "abcd";
        int length1 = calculateLength(str1);
        System.out.println("Length of \"" + str1 + "\" is " + length1);

        String str2 = "GEEKSFORGEEKS";
        int length2 = calculateLength(str2);
        System.out.println("Length of \"" + str2 + "\" is " + length2);
    }
}
