package leetcode.oo.dp.dfs;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/circular-array-loop/
final class CircularArrayLoop {

    public boolean circularArrayLoop(final int[] nums) {
        final Map<Integer, Boolean> map = new HashMap<>(nums.length << 1);
        for (int i = 0; i < nums.length; i++) {
            if (circle(map, i, nums)) {
                return true;
            }
        }
        return false;
    }

    private boolean circle(final Map<Integer, Boolean> map, final int index, final int[] nums) {
        if (map.containsKey(index)) {
            return map.get(index);
        }
        map.put(index, true);
        final int nextIndex = Math.floorMod(index + nums[index], nums.length);
        if (nextIndex != index && nums[nextIndex] * nums[index] > 0) {
            if (this.circle(map, nextIndex, nums)) {
                return true;
            }
        }
        map.put(index, false);
        return false;
    }
}
