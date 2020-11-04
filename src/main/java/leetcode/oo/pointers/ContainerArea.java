package leetcode.oo.pointers;

/**
 * Container with max area.
 * See {@link <a href ="https://leetcode.com/problems/container-with-most-water/">https://leetcode.com/problems/container-with-most-water/</a>}
 */
final class ContainerArea {

    /**
     * Calculate max area.
     * Uses two pointers as xAxis points
     * and iterate through them
     * Complexity: O(n)
     * @param height Array of heights
     * @return Max area
     */
    int maxArea(final int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            final int xLength = right - left;
            max = Math.max(
                max,
                Math.min(height[left], height[right]) * xLength
            );
            if(height[left]<height[right]){
                left++;
            } else{
                right--;
            }
        }
        return max;
    }
}
