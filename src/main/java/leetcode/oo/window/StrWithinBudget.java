package leetcode.oo.window;

//https://leetcode.com/problems/get-equal-substrings-within-budget/
public final class StrWithinBudget {

    public int equalSubstring(String s, String t, int maxCost) {
        int length = 0;
        int left = 0;
        int right = 0;
        int currentCost = 0;
        while (right < s.length()) {
            currentCost += Math.abs((int) s.charAt(right) - (int) t.charAt(right));
            right++;
            while (currentCost > maxCost) {
                currentCost -= Math.abs((int) s.charAt(left) - (int) t.charAt(left));
                left++;
            }
            length = Math.max(length,right-left);
        }
        return length;
    }
}
