package leetcode.oo.strings;

public final class Subsequence {

    public static void main(String[] args) {
        System.out.println(
            new Subsequence().isSubsequence(
                "axc",
                "ahbgdc"
            ));
    }

    public boolean isSubsequence(final String sub, final String main) {
        int subIndex = 0;
        int mainIndex = 0;
        int matchedCnt = 0;
        while (subIndex < sub.length() && mainIndex < main.length()) {
            if (sub.charAt(subIndex) == main.charAt(mainIndex)) {
                subIndex++;
                matchedCnt++;
            }
            mainIndex++;
        }
        return matchedCnt == sub.length();
    }
}
