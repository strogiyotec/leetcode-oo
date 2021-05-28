package leetcode.oo.arrays.matrix;

//https://leetcode.com/problems/count-submatrices-with-all-ones/
final class CountSubmatrices {

    int numSubmat(final int[][] mat) {
        int ans = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    if (j != 0) {
                        mat[i][j] = 1 + mat[i][j - 1];
                    }
                    int max = mat[i][j];
                    for (int k = i; k >= 0; k--) {
                        max = Math.min(max, mat[k][j]);
                        ans += max;
                    }
                }
            }
        }
        return ans;
    }
}
