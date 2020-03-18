package leetcode.oo.pointers;

/**
 * Container with max area.
 * See {@link <a href ="https://leetcode.com/problems/container-with-most-water/">https://leetcode.com/problems/container-with-most-water/</a>}
 */
public final class ContainerArea {

    /**
     * Calculate max area.
     * Uses two pointers as xAxis points
     * and iterate through them
     * Complexity: O(n)
     *
     * @param height Array of heights
     * @return Max area
     */
    public int maxArea(final int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int maxArea = 0;
        while (leftPointer < rightPointer) {
            final int xAxisLength = rightPointer - leftPointer;
            maxArea =
                    Math.max(
                            maxArea,
                            Math.min(
                                    height[leftPointer],
                                    height[rightPointer]
                            ) * xAxisLength
                    );
            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return maxArea;
    }
}
