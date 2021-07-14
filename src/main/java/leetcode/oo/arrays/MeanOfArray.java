package leetcode.oo.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/mean-of-array-after-removing-some-elements/
public final class MeanOfArray {

    public static void main(String[] args) {
        System.out.println(new MeanOfArray().trimMean(
            new int[]{
                6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4
            }
        ));
    }

    public double trimMean(final int[] arr) {
        final int cntToDelete = arr.length * 5 / 100;
        Arrays.sort(arr);
        int sum = 0;
        for (int i = cntToDelete; i < arr.length - cntToDelete; i++) {
            sum += arr[i];
        }
        return sum / (arr.length - cntToDelete * 2.0);
    }
}
