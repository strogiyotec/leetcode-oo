package leetcode.oo.arrays;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/number-of-pairs-of-strings-with-concatenation-equal-to-target/
public final class NumberOfPairsOfStrings {

    public static void main(String[] args) {
        System.out.println(new NumberOfPairsOfStrings().numOfPairs(
            new String[]{
                "777", "7", "77", "77"
            },
            "7777"
        ));
    }

    public int numOfPairs(String[] nums, String target) {
        int res = 0;
        Map<String, Integer> count = new HashMap();
        for (String num : nums)
            count.put(num, count.getOrDefault(num, 0) + 1);
        for (String num : count.keySet()) {
            if (target.indexOf(num) == 0) {
                String suffix = target.substring(num.length());
                res += count.getOrDefault(num, 0) * count.getOrDefault(suffix, 0);
                if (num.equals(suffix)) {
                    res -= count.getOrDefault(suffix, 0);
                }
            }
        }
        return res;
    }

}
