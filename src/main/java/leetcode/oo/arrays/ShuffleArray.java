package leetcode.oo.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/shuffle-the-array/
public final class ShuffleArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ShuffleArray().shuffle(
            new int[]{
                2, 5, 1, 3, 4, 7
            }, 3
        )));
    }

    public int[] shuffle(int[] nums, int n) {
        int middle = nums.length / 2;
        int right = middle;
        int left = 0;
        final int[] array = new int[nums.length];
        int index = 0;
        while (left != middle && right < nums.length) {
            array[index] = nums[left];
            array[index + 1] = nums[right];
            left++;
            right++;
            index += 2;
        }
        return array;
    }
}
