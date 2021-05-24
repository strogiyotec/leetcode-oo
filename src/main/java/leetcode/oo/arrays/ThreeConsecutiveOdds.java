package leetcode.oo.arrays;

//https://leetcode.com/problems/three-consecutive-odds/
final class ThreeConsecutiveOdds {

    boolean threeConsecutiveOdds(final int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] % 2 == 0) {
                i++;
            } else {
                if (i + 2 < arr.length && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                    return true;
                } else {
                    i += 2;
                }
            }
        }
        return false;
    }
}
