package leetcode.oo.arrays;

import java.util.stream.IntStream;

//https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/
final class PartitionArrayInThreeParts {

     boolean canThreePartsEqualSum(final int[] arr) {
        final int sum = IntStream.of(arr).sum();
        if (sum % 3 != 0) {
            return false;
        }
        final int part = sum / 3;
        int currentSum = 0;
        int equalCnt = 0;
        for (final int number : arr) {
            currentSum += number;
            if (currentSum == part) {
                currentSum = 0;
                equalCnt++;
            }
            if(equalCnt == 3){
                return true;
            }
        }
        return false;
    }
}
