package leetcode.oo.arrays.matrix;

//https://leetcode.com/problems/richest-customer-wealth/
public final class RichestCustomer {

    public int maximumWealth(final int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int cnt = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                cnt += accounts[i][j];
            }
            max = Math.max(max,cnt);
        }
        return max;
    }
}
