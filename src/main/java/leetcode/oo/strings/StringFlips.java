package leetcode.oo.strings;

import java.util.List;

//https://leetcode.com/problems/minimum-number-of-flips-to-make-the-binary-string-alternating/
public final class StringFlips {

    public int minFlips(final String word) {
        if (this.isAlt(word)) {
            return 0;
        }
        final String multWord = word.repeat(2);
        final List<String> alternates = this.valids(multWord);
        int min = Integer.MAX_VALUE;
        int firstDiff = 0;
        int secDiff = 0;
        int left = 0;
        for (int i = 0; i < multWord.length(); i++) {
            if (multWord.charAt(i) != alternates.get(0).charAt(i)) {
                firstDiff++;
            }
            if (multWord.charAt(i) != alternates.get(1).charAt(i)) {
                secDiff++;
            }
            if (i >= word.length()) {
                if (multWord.charAt(left) != alternates.get(0).charAt(left)) {
                    firstDiff--;
                }
                if (multWord.charAt(left) != alternates.get(1).charAt(left)) {
                    secDiff--;
                }
                left++;
            }
            if (i >= word.length() - 1) {
                min = Math.min(
                    min,
                    Math.min(
                        firstDiff,
                        secDiff
                    )
                );
            }
        }
        return min;
    }

    private boolean isAlt(final String word) {
        boolean firstZero = word.charAt(0) == '0';
        for (int i = 1; i < word.length(); i++) {
            if (firstZero && word.charAt(i) == '0') {
                return false;
            }
            if (!firstZero && word.charAt(i) == '1') {
                return false;
            }
            firstZero = !firstZero;
        }
        return true;
    }

    private List<String> valids(final String multWord) {
        boolean flag = true;
        final StringBuilder startZero = new StringBuilder(multWord.length());
        final StringBuilder startOne = new StringBuilder(multWord.length());
        for (int i = 0; i < multWord.length(); i++) {
            if (flag) {
                startOne.append('1');
                startZero.append('0');
            } else {
                startOne.append('0');
                startZero.append('1');
            }
            flag = !flag;
        }
        return List.of(startZero.toString(), startOne.toString());
    }
}
