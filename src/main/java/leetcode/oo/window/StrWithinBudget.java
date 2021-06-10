package leetcode.oo.window;

//https://leetcode.com/problems/get-equal-substrings-within-budget/
public final class StrWithinBudget {

    public static void main(String[] args) {
        System.out.println(new StrWithinBudget().equalSubstring(
            "abcd",
            "bcdf",
            3
        ));
        System.out.println(new StrWithinBudget().equalSubstring(
            "abcd",
            "cdef",
            3
        ));
    }

    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0;
        int currentLength = 0;
        for (int right = 0; right < s.length(); right++) {
            currentLength += Math.abs(s.charAt(right) - t.charAt(right));
            if (currentLength > maxCost) {
                currentLength -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
        }
        return s.length() - left;
    }
}
