package leetcode.oo.search;

public final class MissingPositive {

    public int firstMissingPositive(int[] A) {
        if (A == null || A.length == 0) {
            return 1;
        }
        int start = 0, end = A.length - 1;
        while (start <= end) {
            while (start < A.length && A[start] > 0) {
                start++;
            }
            while (end >= 0 && A[end] <= 0) {
                end--;
            }
            if (start <= end) {
                int temp = A[start];
                A[start] = A[end];
                A[end] = temp;
            }
        }
        for (int i = 0; i < start; i++) {
            if (Math.abs(A[i]) <= A.length && A[Math.abs(A[i]) - 1] > 0) {
                A[Math.abs(A[i]) - 1] = -A[Math.abs(A[i]) - 1];
            }
        }
        for (int i = 0; i < start; i++) {
            if (A[i] > 0) {
                return i + 1;
            }
        }
        return start + 1;
    }
}
