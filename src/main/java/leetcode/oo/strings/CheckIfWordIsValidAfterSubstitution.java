package leetcode.oo.strings;

import java.util.ArrayList;

//https://leetcode.com/problems/check-if-word-is-valid-after-substitutions/
public final class CheckIfWordIsValidAfterSubstitution {

    public boolean isValid(final String word) {
        final ArrayList<Character> stack = new ArrayList<>(3);
        for (int i = 0; i <= word.length(); i++) {
            if (stack.size() >= 3) {
                if (stack.get(stack.size() - 1) == 'c' && stack.get(stack.size() - 2) == 'b' && stack.get(stack.size() - 3) == 'a') {
                    stack.remove(stack.size() - 1);
                    stack.remove(stack.size() - 1);
                    stack.remove(stack.size() - 1);
                }
            }
            if(i < word.length()){
                stack.add(word.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
