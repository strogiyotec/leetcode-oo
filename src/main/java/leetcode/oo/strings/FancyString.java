package leetcode.oo.strings;

import java.util.ArrayList;
import java.util.Objects;

//https://leetcode.com/problems/delete-characters-to-make-fancy-string/description/
public final class FancyString {

    public static void main(final String[] args) {
        System.out.println(new FancyString().makeFancyString(
            "aaabaaaa"
        ));
    }

    public String makeFancyString(String s) {
        final StringBuilder builder = new StringBuilder(s.length());
        final ArrayList<Character> stack = new ArrayList<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            stack.add(s.charAt(i));
            if (stack.size() >= 3 && Objects.equals(stack.get(stack.size() - 1), stack.get(stack.size() - 2)) && Objects.equals(stack.get(stack.size() - 2), stack.get(stack.size() - 3))) {
                stack.remove(stack.size() - 1);
            }
        }
        for (final Character character : stack) {
            builder.append(character);
        }
        return builder.toString();
    }
}
