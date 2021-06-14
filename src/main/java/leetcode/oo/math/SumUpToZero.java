package leetcode.oo.math;

import java.util.Arrays;

//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
public final class SumUpToZero {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SumUpToZero().sumZero(4)));
        System.out.println(Arrays.toString(new SumUpToZero().sumZero(5)));
    }

    public int[] sumZero(int n) {
        final int[] solution = new int[n];
        final int middle = n / 2;
        if (n % 2 != 0) {
            solution[middle] = 0;
        }
        int left = middle - 1;
        int right = middle + ((n % 2 != 0) ? 1 : 0);
        int rightNum = 1;
        int leftNum = -1 * middle;
        while (left >= 0 && right < solution.length) {
            solution[left] = leftNum;
            solution[right] = rightNum;
            left--;
            right++;
            leftNum += 1;
            rightNum += 1;
        }
        return solution;
    }
}
