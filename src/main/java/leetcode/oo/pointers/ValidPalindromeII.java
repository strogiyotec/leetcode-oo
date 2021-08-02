package leetcode.oo.pointers;

//https://leetcode.com/problems/valid-palindrome-ii/
public final class ValidPalindromeII {

    public static void main(String[] args) {
        System.out.println(new ValidPalindromeII().validPalindrome(
            "abca"
        ));
    }

    public boolean validPalindrome(String s) {
        return this.checkPalindrome(
            0,
            s.length()-1,
            false,
            s
        );
    }

    private boolean checkPalindrome(
        final int left,
        final int right,
        final boolean deleted,
        final String s
    ) {
        if (left > right) {
            return true;
        }
        if (s.charAt(left) == s.charAt(right)) {
            return this.checkPalindrome(left + 1, right - 1, deleted, s);
        } else {
            if (deleted) {
                return false;
            } else {
                return this.checkPalindrome(left + 1, right, true, s) || this.checkPalindrome(left, right - 1, true, s);
            }
        }
    }
}
