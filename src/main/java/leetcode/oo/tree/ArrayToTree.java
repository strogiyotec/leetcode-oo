package leetcode.oo.tree;


/**
 * Sorted array to tree.
 * See {@link <a href ="https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/">https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/</a>}.
 */
final class ArrayToTree {

    PlainTree sortedArrayToBST(final int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        if (nums.length == 1) {
            return new PlainTree(nums[0]);
        }
        return this.tree(0, nums.length - 1, nums);
    }

    private PlainTree tree(final int left, final int right, final int[] nums) {
        if (left > right) {
            return null;
        }
        final int middle = left + (right - left) / 2;
        final PlainTree tree = new PlainTree(nums[middle]);
        tree.left = this.tree(left, middle - 1, nums);
        tree.right = this.tree(middle + 1, right, nums);
        return tree;
    }
}
