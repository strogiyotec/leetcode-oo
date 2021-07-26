package leetcode.oo.dp;

//https://leetcode.com/problems/closest-dessert-cost/
final class DesertCost {

    private int result;

    public int closestCost(
        final int[] baseCosts,
        final int[] toppingCosts,
        final int target
    ) {
        this.result = baseCosts[0];
        for (final int baseCost : baseCosts) {
            this.dfs(baseCost, target, toppingCosts, 0);
        }
        return this.result;
    }

    private void dfs(final int current, final int target, final int[] toppingCosts, final int topIndex) {
        final int diffCurrent = Math.abs(current - target);
        final int diffResult = Math.abs(this.result - target);
        if (diffCurrent < diffResult || diffCurrent == diffResult && current < target) {
            this.result = current;
        }
        if (topIndex >= toppingCosts.length) {
            return;
        }
        if (current > target) {
            return;
        }
        this.dfs(current, target, toppingCosts, topIndex + 1);
        this.dfs(current + toppingCosts[topIndex], target, toppingCosts, topIndex + 1);
        this.dfs(current + (toppingCosts[topIndex] << 1), target, toppingCosts, topIndex + 1);
    }
}
