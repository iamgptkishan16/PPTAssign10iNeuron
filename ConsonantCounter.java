/*Question[8]-------Given a string, count total number of consonants in it. A consonant is an English alphabet character that is not vowel (a, e, i, o and u). Examples of constants are b, c, d, f, and g.

**Examples :** Input : abc de
Output : 3
There are three consonants b, c and d.

Input : geeksforgeeks portal
Output : 12*/


public class ConsonantCounter {
    public static int countConsonants(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert the string to lowercase for easier comparison

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isConsonant(ch)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isConsonant(char ch) {
        return (ch >= 'a' && ch <= 'z') && !isVowel(ch);
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String str1 = "abc de";
        int count1 = countConsonants(str1);
        System.out.println("Number of consonants in \"" + str1 + "\": " + count1);

        String str2 = "geeksforgeeks portal";
        int count2 = countConsonants(str2);
        System.out.println("Number of consonants in \"" + str2 + "\": " + count2);
    }
}


