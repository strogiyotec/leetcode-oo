package leetcode.oo.window;

//https://leetcode.com/problems/get-equal-substrings-within-budget/
public final class StrWithinBudget {

    public static void main(String[] args) {
        System.out.println(
            new StrWithinBudget().equalSubstring(
                "krpgjbjjznpzdfy",
                "nxargkbydxmsgby",
                14
            )
        );
        System.out.println(
            new StrWithinBudget().equalSubstring(
                "abcd",
                "cdef",
                3
            )
        );
        System.out.println(
            new StrWithinBudget().equalSubstring(
                "abcd",
                "bcdf",
                3
            )
        );
    }

    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0;
        int right = 0;
        int currentCost = 0;
        while (right < s.length()) {
            currentCost += Math.abs(s.charAt(right) - t.charAt(right));
            if (currentCost > maxCost) {
                currentCost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
            right++;
        }
        return s.length()-left;
    }
}
