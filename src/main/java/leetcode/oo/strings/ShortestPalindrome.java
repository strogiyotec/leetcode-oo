package leetcode.oo.strings;

//https://leetcode.com/problems/shortest-palindrome/
final class ShortestPalindrome {

    public String shortestPalindrome(final String str) {
        final String reversed = new StringBuilder(str).reverse().toString();
        for (int i = 0; i < reversed.length(); i++) {
            if (str.startsWith(reversed.substring(i))) {
                return reversed.substring(0, i) + str;
            }
        }
        return reversed + str;
    }
}
