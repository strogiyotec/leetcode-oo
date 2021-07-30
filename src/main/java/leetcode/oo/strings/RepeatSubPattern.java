package leetcode.oo.strings;

//https://leetcode.com/problems/repeated-substring-pattern/
public final class RepeatSubPattern {

    public static void main(final String[] args) {
        System.out.println(new RepeatSubPattern().repeatedSubstringPattern("abab"));
        System.out.println(new RepeatSubPattern().repeatedSubstringPattern("abcabcabc"));
        System.out.println(new RepeatSubPattern().repeatedSubstringPattern("aba"));
        System.out.println(new RepeatSubPattern().repeatedSubstringPattern("abaababaab"));
        System.out.println(new RepeatSubPattern().repeatedSubstringPattern("a"));
    }

    public boolean repeatedSubstringPattern(final String str) {
        for (int i = 1; i <= str.length() / 2; i++) {
            final String sub = str.substring(0, i);
            if (str.length() % sub.length() == 0) {
                final String whole = sub.repeat(str.length() / sub.length());
                if(whole.equals(str)){
                    return true;
                }
            }
        }
        return false;
    }
}
