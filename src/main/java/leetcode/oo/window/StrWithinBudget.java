package leetcode.oo.window;

//https://leetcode.com/problems/get-equal-substrings-within-budget/
public final class StrWithinBudget {

    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0;
        int right = 0;
        int currentCost = 0;
        int solution = 0;
        while (right < s.length()) {
            currentCost += Math.abs((int) s.charAt(right) - (int) t.charAt(right));
            right++;
            if (currentCost <= maxCost) {
                solution = Math.max(right - left,solution);
            } else {
                currentCost -= Math.abs((int) s.charAt(left) - (int) t.charAt(left));
                left++;
            }
        }
        return solution;
    }
}
