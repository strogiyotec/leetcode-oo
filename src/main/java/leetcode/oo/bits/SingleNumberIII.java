package leetcode.oo.bits;

//https://leetcode.com/problems/single-number-iii/
final class SingleNumberIII {

    int[] singleNumber(int[] nums) {
        int diff = 0;
        for (final int num : nums) {
            diff ^= num;
        }
        diff &= -diff;
        final int[] result = new int[2];
        for (final int num : nums) {
            if ((diff & num) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }
        return result;
    }
}
