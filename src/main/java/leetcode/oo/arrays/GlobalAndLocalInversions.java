package leetcode.oo.arrays;

//https://leetcode.com/problems/global-and-local-inversions/
final class GlobalAndLocalInversions {

     boolean isIdealPermutation(final int[] A) {
        int max = -1;
        for (int i = 0; i < A.length-2; i++) {
            max = Math.max(max,A[i]);
            if(max > A[i+2]){
                return false;
            }
        }
        return true;
    }
}
