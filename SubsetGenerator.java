/*Question[3-----Given a set represented as a string, write a recursive code to print all subsets of it. The subsets can be printed in any order.

**Example 1:**

Input :  set = “abc”

Output : { “”, “a”, “b”, “c”, “ab”, “ac”, “bc”, “abc”}

**Example 2:**

Input : set = “abcd”

Output : { “”, “a” ,”ab” ,”abc” ,”abcd”, “abd” ,”ac” ,”acd”, “ad” ,”b”, “bc” ,”bcd” ,”bd” ,”c” ,”cd” ,”d” }*/



import java.util.ArrayList;
import java.util.List;

public class SubsetGenerator {
    public static void generateSubsets(String set) {
        List<String> subsets = new ArrayList<>();
        generateSubsetsRecursive(0, set, "", subsets);
        System.out.println(subsets);
    }

    private static void generateSubsetsRecursive(int index, String set, String subset, List<String> subsets) {
        if (index == set.length()) {
            subsets.add(subset);
            return;
        }

        // Exclude current element
        generateSubsetsRecursive(index + 1, set, subset, subsets);

        // Include current element
        generateSubsetsRecursive(index + 1, set, subset + set.charAt(index), subsets);
    }

    public static void main(String[] args) {
        String set = "abcd";
        generateSubsets(set);
    }
}
