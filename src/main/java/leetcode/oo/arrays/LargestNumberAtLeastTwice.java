package leetcode.oo.arrays;

//https://leetcode.com/problems/largest-number-at-least-twice-of-others/
public final class LargestNumberAtLeastTwice {

    public static void main(String[] args) {
        System.out.println(new LargestNumberAtLeastTwice().dominantIndex(
            new int[]{0,0,3,2}
        ));
    }

    public int dominantIndex(final int[] nums) {
        int biggest = 0;
        int index = -1;
        int secBiggest = 0;
        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            if (num > biggest) {
                secBiggest = biggest;
                biggest = num;
                index = i;
            } else{
                secBiggest = Math.max(secBiggest,num);
            }
        }
        if (biggest >= secBiggest << 1) {
            return index;
        } else {
            return -1;
        }
    }
}
