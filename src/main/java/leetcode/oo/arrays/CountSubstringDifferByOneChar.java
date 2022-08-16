package leetcode.oo.arrays;

//https://leetcode.com/problems/count-substrings-that-differ-by-one-character/
public final class CountSubstringDifferByOneChar {

    public int countSubstrings(final String first, final String second) {
        int res = 0;
        for (int i = 0; i < first.length(); i++) {
            for (int j = 0; j < second.length(); j++) {
                int differentCharacters = 0;
                for (int pos = 0; pos + i < first.length() && pos + j < second.length(); pos++) {
                    if (first.charAt(pos + i) != second.charAt(pos + j)) {
                        differentCharacters++;
                        if (differentCharacters > 1) {
                            break;
                        }
                    }
                    res+=differentCharacters;
                }
            }
        }
        return res;
    }
}
