package leetcode.oo.arrays;

//https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/
public final class AtLeastAway {

    public static void main(String[] args) {
        System.out.println(new AtLeastAway().kLengthApart(
            new int[]{1, 0, 0, 0, 1, 0, 0, 1, 0},
            2
        ));
    }

    public boolean kLengthApart(int[] nums, int k) {
        int index = 0;
        while (index + 1 < nums.length) {
            if (nums[index] == 1) {
                int next = index + 1;
                while (next < nums.length && nums[next] != 1) {
                    next++;
                }
                if (next < nums.length && nums[next] == 1 && next - index - 1 < k) {
                    return false;
                }
                index = next;
            } else {
                index++;
            }
        }
        return true;
    }
}
