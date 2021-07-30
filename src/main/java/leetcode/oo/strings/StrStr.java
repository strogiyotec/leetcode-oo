package leetcode.oo.strings;

//https://leetcode.com/problems/implement-strstr/
public final class StrStr {

    public static void main(final String[] args) {
        System.out.println(new StrStr().strStr(
            "mississippi",
            "issip"
        ));
        System.out.println(new StrStr().strStr(
            "a",
            "a"
        ));
        System.out.println(new StrStr().strStr(
            "aaaaa",
            "bba"
        ));
        System.out.println(new StrStr().strStr(
            "hello",
            "ll"
        ));
    }

    public int strStr(String haystack, String needle) {
        if (needle.isBlank()) {
            return 0;
        }
        final char firstNeedle = needle.charAt(0);
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            while (i <= haystack.length() - needle.length() && haystack.charAt(i) != firstNeedle) {
                i++;
            }
            if (i <= haystack.length() - needle.length()) {
                int index = i;
                int j = 0;
                while (j < needle.length() && index < haystack.length() && haystack.charAt(index) == needle.charAt(j)) {
                    index++;
                    j++;
                }
                if (j == needle.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}
