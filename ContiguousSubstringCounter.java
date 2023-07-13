/*Question[5]-------We are given a string S, we need to find count of all contiguous substrings starting and ending with same character. Input  : S = "abcab"
Output : 7
There are 15 substrings of "abcab"
a, ab, abc, abca, abcab, b, bc, bca
bcab, c, ca, cab, a, ab, b
Out of the above substrings, there
are 7 substrings : a, abca, b, bcab,
c, a and b.

Input  : S = "aba"
Output : 4
The substrings are a, b, a and aba*/


public class ContiguousSubstringCounter {
    public static int countContiguousSubstrings(String S) {
        int count = 0;
        int length = S.length();

        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (S.charAt(i) == S.charAt(j)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String S1 = "abcab";
        int count1 = countContiguousSubstrings(S1);
        System.out.println("Count of contiguous substrings in \"" + S1 + "\" is " + count1);

        String S2 = "aba";
        int count2 = countContiguousSubstrings(S2);
        System.out.println("Count of contiguous substrings in \"" + S2 + "\" is " + count2);
    }
}
