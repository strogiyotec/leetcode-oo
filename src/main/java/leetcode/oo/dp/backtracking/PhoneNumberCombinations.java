package leetcode.oo.dp.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Letter Combinations of a Phone Number.
 * See {@link <a href ="https://leetcode.com/problems/letter-combinations-of-a-phone-number/">https://leetcode.com/problems/letter-combinations-of-a-phone-number/</a>}
 */
final class PhoneNumberCombinations {

    private final Map<Character, String> combinations;

    PhoneNumberCombinations() {
        this.combinations = new HashMap<>(16, 1.0F);
        this.combinations.put('2', "abc");
        this.combinations.put('3', "def");
        this.combinations.put('4', "ghi");
        this.combinations.put('5', "jkl");
        this.combinations.put('6', "mno");
        this.combinations.put('7', "pqrs");
        this.combinations.put('8', "tuv");
        this.combinations.put('9', "wxyz");
    }

    List<String> letterCombinations(final String digits) {
        if (digits.isEmpty()) {
            return Collections.emptyList();
        }
        final List<String> solution = new ArrayList<>(16);
        this.search(new StringBuilder(16),0,digits,solution);
        return solution;

    }

    private void search(final StringBuilder combination, final int position, final String digits, final List<String> solution) {
        if (digits.length() == position) {
            solution.add(combination.toString());
            return;
        }
        final String letters = this.combinations.get(digits.charAt(position));
        for (int i = 0; i < letters.length(); i++) {
            combination.append(letters.charAt(i));
            this.search(combination, position + 1, digits, solution);
            combination.deleteCharAt(combination.length() - 1);
        }
    }

}
