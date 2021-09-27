package leetcode.oo.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/concatenation-of-array/
public final class ConcatArray {

    public static void main(String[] args) {
        System.out.println(
            Arrays.toString(new ConcatArray().getConcatenation(
                new int[]{1,3,2,1}
                )
            )
        );
    }

    public int[] getConcatenation(int[] nums) {
        final int[] answer = new int[nums.length << 1];
        for (int i = 0; i < answer.length; i++) {
            if (i < nums.length) {
                answer[i] = nums[i];
            } else {
                answer[i] = nums[i % nums.length];
            }
        }
        return answer;
    }
}
