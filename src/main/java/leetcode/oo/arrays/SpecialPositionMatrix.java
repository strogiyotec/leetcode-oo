package leetcode.oo.arrays;

/**
 * Special position matrix.
 * See {@link <a href ="https://leetcode.com/problems/special-positions-in-a-binary-matrix/">https://leetcode.com/problems/special-positions-in-a-binary-matrix/</a>}
 */
final class SpecialPositionMatrix {

    int numSpecial(final int[][] mat) {
        int cnt = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    boolean found = true;
                    for (int k = 0; k < mat[0].length; k++) {
                        if (mat[i][k] == 1 && k != j) {
                            found = false;
                            break;
                        }
                    }
                    if (found) {
                        for (int k = 0; k < mat.length; k++) {
                            if (mat[k][j] == 1 && k != i) {
                                found = false;
                                break;
                            }
                        }
                    }
                    if (found) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
