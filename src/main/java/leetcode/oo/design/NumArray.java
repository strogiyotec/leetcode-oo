package leetcode.oo.design;

//https://leetcode.com/problems/range-sum-query-mutable/
final class NumArray {

    private final SegmentTree tree;

    NumArray(int[] nums) {
        this.tree = new SegmentTree(nums, 0, nums.length - 1);
    }

    public void update(int index, int val) {
        this.tree.update(val, index);
    }

    public int sumRange(int left, int right) {
        return this.tree.sumRange(left, right);
    }

    static class SegmentTree {

        private SegmentTree left;

        private SegmentTree right;

        private int leftIndex;

        private int rightIndex;

        private int sum;

        //0,7
        public SegmentTree(final int[] array, final int leftIndex, final int rightIndex) {
            this.leftIndex = leftIndex;
            this.rightIndex = rightIndex;
            if (leftIndex == rightIndex) {
                this.sum = array[leftIndex];
            } else {
                final int middle = (rightIndex - leftIndex) / 2 + leftIndex;
                this.left = new SegmentTree(array, leftIndex, middle);
                this.right = new SegmentTree(array, middle + 1, rightIndex);
                this.recalcSum();
            }
        }

        public int sumRange(final int left, final int right) {
            if (left > this.rightIndex || right < this.leftIndex) {
                return 0;
            }
            if (left <= this.leftIndex && right >= this.rightIndex) {
                return this.sum;
            } else {
                return this.left.sumRange(left, right) + this.right.sumRange(left, right);
            }
        }

        public void update(final int sum, final int index) {
            if (this.leftIndex == this.rightIndex) {
                this.sum = sum;
            } else {
                if (index <= this.left.rightIndex) {
                    this.left.update(sum, index);
                } else {
                    this.right.update(sum, index);
                }
                this.recalcSum();
            }
        }

        private void recalcSum() {
            if (this.leftIndex == this.rightIndex) {
                return;
            }
            this.sum = this.left.sum + this.right.sum;
        }
    }
}
