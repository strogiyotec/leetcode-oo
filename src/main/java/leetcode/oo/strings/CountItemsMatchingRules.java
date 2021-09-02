package leetcode.oo.strings;

import java.util.List;

//https://leetcode.com/problems/count-items-matching-a-rule/
public final class CountItemsMatchingRules {

    public static void main(String[] args) {
        System.out.println(new CountItemsMatchingRules().countMatches(
            List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone")
            ),
            "color",
            "silver"
        ));
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cnt = 0;
        for (final List<String> item : items) {
            if(ruleKey.equals("type") && ruleValue.equals(item.get(0))){
                cnt++;
            } else if (ruleKey.equals("color") && ruleValue.equals(item.get(1))){
                cnt++;
            } else if(ruleKey.equals("name") && ruleValue.equals(item.get(2))){
                cnt++;
            }
        }
        return cnt;
    }
}
