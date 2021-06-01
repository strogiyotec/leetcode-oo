package leetcode.oo.sort;

//https://leetcode.com/problems/minimum-swaps-to-arrange-a-binary-grid/
final class MinSwapArrangeGrid {

    int minSwaps(final int[][] grid) {
        final int[] zerosPerRow = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                if (grid[i][j] == 0) {
                    zerosPerRow[i]++;
                } else {
                    break;
                }
            }
        }
        int swapsCnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = i; j < grid.length; j++) {
                final int requiredZeros = grid.length - i - 1;
                if (zerosPerRow[j] >= requiredZeros) {
                    for (int k = j; k > i; k--) {
                        final int temp = zerosPerRow[k];
                        zerosPerRow[k] = zerosPerRow[k - 1];
                        zerosPerRow[k - 1] = temp;
                        swapsCnt++;
                    }
                    break;
                }
                if (j == grid.length - 1) {
                    return -1;
                }
            }
        }
        return swapsCnt;
    }
}
