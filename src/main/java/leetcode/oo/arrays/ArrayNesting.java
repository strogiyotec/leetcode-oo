package leetcode.oo.arrays;

//https://leetcode.com/problems/array-nesting/
final class ArrayNesting {

    int arrayNesting(final int[] nums) {
        final boolean[] visited = new boolean[nums.length];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int cnt = 0;
            int index = i;
            int number = nums[index];
            while (!visited[index]) {
                cnt++;
                visited[index] = true;
                index = number;
                number = nums[index];
            }
            max = Math.max(cnt, max);
        }
        return max;
    }

}
