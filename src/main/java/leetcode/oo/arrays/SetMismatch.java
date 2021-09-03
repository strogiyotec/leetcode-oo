package leetcode.oo.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/set-mismatch/
public final class SetMismatch {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SetMismatch().findErrorNums(
            new int[]{
                3, 2, 3, 4, 6, 5
            }
        )));
        System.out.println(Arrays.toString(new SetMismatch().findErrorNums(
            new int[]{
                3, 2, 2
            }
        )));
        System.out.println(Arrays.toString(new SetMismatch().findErrorNums(
            new int[]{
                1, 2, 2, 4
            }
        )));
        System.out.println(Arrays.toString(new SetMismatch().findErrorNums(
            new int[]{
                2, 2
            }
        )));
    }

    public int[] findErrorNums(int[] nums) {
        final Map<Integer, Integer> map = new HashMap<>(nums.length, 1.0f);
        for (final int num : nums) {
            map.merge(num, 1, Integer::sum);
        }
        int missingNumber = 0;
        int duplicate = 0;
        for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2) {
                    duplicate = i;
                }
            } else {
                missingNumber = i;
            }
        }
        return new int[]{duplicate, missingNumber};
    }
}
