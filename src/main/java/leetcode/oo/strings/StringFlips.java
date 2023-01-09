package leetcode.oo.strings;

//https://leetcode.com/problems/minimum-number-of-flips-to-make-the-binary-string-alternating/
public final class StringFlips {

    public int minFlips(final String word) {
        if (this.alternating(word)) {
            return 0;
        }
        final String expended = word.repeat(2);
        final String[] options = this.fillOptions(expended.length());
        int diffZero = 0;
        int diffOne = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < expended.length(); i++) {
            if (options[0].charAt(i) != expended.charAt(i)) {
                diffZero++;
            }
            if (options[1].charAt(i) != expended.charAt(i)) {
                diffOne++;
            }
            if (i >= word.length()) {
                final char left = expended.charAt(i - word.length());
                if (left != options[0].charAt(i-word.length())) {
                    diffZero--;
                }
                if (left != options[1].charAt(i-word.length())) {
                    diffOne--;
                }
            }
            if(i>=word.length()-1){
                min = Math.min(
                    min,
                    Math.min(
                        diffOne,
                        diffZero
                    )
                );
            }
        }
        return min;
    }

    private String[] fillOptions(final int length) {
        final StringBuilder startZero = new StringBuilder(length);
        final StringBuilder startOne = new StringBuilder(length);
        boolean appendZero = true;
        for (int i = 0; i < length; i++) {
            if (appendZero) {
                startZero.append('0');
                startOne.append('1');
            } else {
                startZero.append('1');
                startOne.append('0');
            }
            appendZero = !appendZero;
        }
        final String[] options = new String[2];
        options[0] = startZero.toString();
        options[1] = startOne.toString();
        return options;
    }

    private boolean alternating(final String word) {
        boolean startZero = word.charAt(0) == '0';
        for (int i = 1; i < word.length(); i++) {
            if (startZero && word.charAt(i) == '0') {
                return false;
            }
            if (!startZero && word.charAt(i) == '1') {
                return false;
            }
            startZero = !startZero;
        }
        return true;
    }

}
