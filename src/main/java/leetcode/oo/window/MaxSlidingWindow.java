package leetcode.oo.window;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Maximum sliding window.
 * See {@link <a href ="https://leetcode.com/problems/sliding-window-maximum/">https://leetcode.com/problems/sliding-window-maximum/</a>}
 */
public final class MaxSlidingWindow {

    /**
     * Find max sliding window array values.
     *
     * @param nums  Numbers
     * @param limit Limit
     * @return Array with max sliding values
     */
    public int[] maxSlidingWindow(final int[] nums, final int limit) {
        final int length = nums.length;
        if (length == 0) {
            return new int[0];
        }
        final int[] result = new int[length - limit + 1];
        final Deque<Integer> indexesStorage = new ArrayDeque<>(limit + 1);
        int resultIndex = 0;
        for (int index = 0; index < length; index++) {
            while (this.firstIndexExceedLimit(indexesStorage, limit, index)) {
                indexesStorage.pollFirst();
            }
            while (this.lastValueSmaller(indexesStorage, nums, index)) {
                indexesStorage.pollLast();
            }
            indexesStorage.offerLast(index);
            if (index >= limit - 1) {
                result[resultIndex++] = nums[indexesStorage.peekFirst()];
            }
        }
        return result;
    }

    /**
     * Check if number with last index is smaller than value by current index.
     * The first index in index storage is always the index that
     * represents the biggest value in nums array by given index
     * If value by last index from indexStorage is smaller than
     * value by current iterator index than last index
     * must be deleted from indexStorage
     * In this case storage will store only indexes of
     * biggest values
     *
     * @param indexesStorage Storage of indexes
     * @param nums           Array of numbers
     * @param currentIndex   Current iterator index
     * @return True if value by last index of storage
     * is smaller than value by currentIndex
     */
    private boolean lastValueSmaller(
            final Deque<Integer> indexesStorage,
            final int[] nums,
            final int currentIndex
    ) {
        return !indexesStorage.isEmpty()
                && nums[indexesStorage.peekLast()] < nums[currentIndex];
    }

    /**
     * Check if first index in indexStorage doesn't exceed limit.
     * As only numbers with limited range should be checked
     * we should delete the first index if
     * they are outside of this limit
     * For example: limit is 3 and storage contains
     * the following indexes (1,[2,3,4])
     * In this case first index should be deleted because
     * it's outside of range
     *
     * @param indexesStorage Storage of indexes
     * @param limit          Limit
     * @param currentIndex   Current iterator index
     * @return True if limit exceeded
     */
    private boolean firstIndexExceedLimit(
            final Deque<Integer> indexesStorage,
            final int limit,
            final int currentIndex
    ) {
        return !indexesStorage.isEmpty()
                && indexesStorage.peekFirst() < currentIndex + 1 - limit;
    }
}
