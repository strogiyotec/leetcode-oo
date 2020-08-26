package leetcode.oo.dp.backtracking;

import java.util.*;

/**
 *Letter Combinations of a Phone Number.
 * See {@link <a href ="https://leetcode.com/problems/letter-combinations-of-a-phone-number/">https://leetcode.com/problems/letter-combinations-of-a-phone-number/</a>}
 */
final class PhoneNumberCombinations {
    private final Map<Character, String> combinations;

    PhoneNumberCombinations() {
        this.combinations = new HashMap<>(16, 1);
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
        final List<String> solution = new ArrayList<>();
        final Search search = new Search() {
            @Override
            public void combinations(final StringBuilder combination, final int index) {
                if (digits.length() == index) {
                    solution.add(combination.toString());
                    return;
                }
                final String letters = PhoneNumberCombinations.this.combinations.get(digits.charAt(index));
                for (int i = 0; i < letters.length(); i++) {
                    this.combinations(combination.append(letters.charAt(i)), index + 1);
                    combination.deleteCharAt(combination.length() - 1);
                }
            }
        };
        search.combinations(new StringBuilder(), 0);
        return solution;

    }

    interface Search {
        void combinations(StringBuilder combination, int index);
    }
}
