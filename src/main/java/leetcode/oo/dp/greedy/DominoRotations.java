package leetcode.oo.dp.greedy;

/**
 * Minimum Domino Rotations For Equal Row.
 * See {@link <a href ="https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/">https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/</a>}.
 */
final class DominoRotations {

    int minDominoRotations(final int[] A, final int[] B) {
        final int first = A[0];
        final int second = B[0];
        boolean ifTop = true;
        boolean ifBottom = true;
        for (int i = 0; i < A.length; i++) {
            if (first != A[i] && first != B[i]) {
                ifTop = false;
            }
            if (second != A[i] && second != B[i]) {
                ifBottom = false;
            }
        }
        if (!ifBottom && !ifTop) {
            return -1;
        }
        final int number = ifTop ? A[0] : B[0];
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != number) {
                cnt1++;
            }
            if (B[i] != number) {
                cnt2++;
            }
        }
        return Math.min(cnt1, cnt2);
    }
}
