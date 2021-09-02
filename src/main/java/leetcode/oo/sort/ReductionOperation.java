package leetcode.oo.sort;

import java.util.Arrays;

//https://leetcode.com/problems/reduction-operations-to-make-the-array-elements-equal/
public final class ReductionOperation {

    public static void main(String[] args) {
        System.out.println(new ReductionOperation().reductionOperations(
            new int[]{1, 1, 2, 2, 3}
        ));
    }

    public int reductionOperations(final int[] nums) {
        Arrays.sort(nums);
        int cnt = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if(nums[i] != nums[i-1]){
                cnt+=nums.length-i;
            }
        }
        return cnt;
    }
}
