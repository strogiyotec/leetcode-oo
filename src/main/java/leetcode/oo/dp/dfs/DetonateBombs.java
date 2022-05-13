package leetcode.oo.dp.dfs;

//https://leetcode.com/problems/detonate-the-maximum-bombs/
final class DetonateBombs {

    private int count;

    int maximumDetonation(int[][] bombs) {
        int ans = 0;
        for (int i = 0; i < bombs.length; i++) {
            this.count = 0; // Start a new search, reset count
            this.dfs(i, new boolean[bombs.length], bombs);
            ans = Math.max(ans, this.count);
        }
        return ans;
    }

    private void dfs(final int node, final boolean[] cache, final int[][] bombs) {
        this.count++;
        cache[node] = true;
        for (int i = 0; i < bombs.length; i++) {
            if (!cache[i] && this.inRange(bombs[node], bombs[i])) {
                this.dfs(i, cache, bombs);
            }
        }
    }

    private boolean inRange(final int[] from, final int[] to) {
        final long distanceX = from[0] - to[0];
        final long distanceY = from[1] - to[1];
        final long radious = from[2];
        return distanceX*distanceX + distanceY*distanceY <=radious*radious;
    }

}
