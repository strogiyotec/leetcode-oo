package leetcode.oo.strings;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
public final class RemoveAdjacentDupl {

    public static void main(String[] args) {
        System.out.println(new RemoveAdjacentDupl().removeDuplicates("abbaca"));
        System.out.println(new RemoveAdjacentDupl().removeDuplicates("azxxzy"));
    }

    public String removeDuplicates(final String s) {
        final StringBuilder builder = new StringBuilder(s);
        int left = 0;
        int right = left + 1;
        while (right < builder.length()) {
            if (builder.charAt(left) == builder.charAt(right)) {
                builder.deleteCharAt(right);
                builder.deleteCharAt(left);
                left = Math.max(0, left - 1);
                right = left + 1;
            } else{
                left++;
                right++;
            }
        }
        return builder.toString();
    }
}
