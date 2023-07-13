/*Question[7]----Given a string **str**, the task is to print all the permutations of **str**. A **permutation** is an arrangement of all or part of a set of objects, with regard to the order of the arrangement. For instance, the words ‘bat’ and ‘tab’ represents two distinct permutation (or arrangements) of a similar three letter word.

**Examples:**

> Input: str = “cd”
> 
> 
> **Output:** cd dc
> 
> **Input:** str = “abb”
> 
> **Output:** abb abb bab bba bab bba
>

*/

public class PermutationPrinter {
    public static void printPermutations(String str) {
        char[] chars = str.toCharArray();
        printPermutationsRecursive(chars, 0, chars.length - 1);
    }

    private static void printPermutationsRecursive(char[] chars, int left, int right) {
        if (left == right) {
            System.out.println(new String(chars));
        } else {
            for (int i = left; i <= right; i++) {
                swap(chars, left, i);
                printPermutationsRecursive(chars, left + 1, right);
                swap(chars, left, i); // Backtracking
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String str1 = "cd";
        System.out.println("Permutations of \"" + str1 + "\":");
        printPermutations(str1);

        String str2 = "abb";
        System.out.println("Permutations of \"" + str2 + "\":");
        printPermutations(str2);
    }
}
