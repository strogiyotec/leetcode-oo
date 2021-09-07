package leetcode.oo.arrays;

//https://leetcode.com/problems/shortest-subarray-to-be-removed-to-make-array-sorted/
public final class RemoveSortedArray {

    public int findLengthOfShortestSubarray(int[] arr) {
        int left = 0;
        while (left + 1 < arr.length && arr[left] <= arr[left + 1]) {
            left++;
        }
        if (left == arr.length - 1) {
            return 0;
        }
        int right = arr.length - 1;
        while (right > left && arr[right - 1] <= arr[right]) {
            right--;
        }
        int res = Math.min(arr.length-1-left,right);
        int i = 0;
        int j = right;
        while(i<=left && j < arr.length){
            if(arr[i]<=arr[j]){
                res = Math.min(res,j-i-1);
                i++;
            } else{
                j++;
            }
        }
        return res;
    }
}
