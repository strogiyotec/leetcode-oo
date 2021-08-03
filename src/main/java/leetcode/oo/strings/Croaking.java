package leetcode.oo.strings;

//https://leetcode.com/problems/minimum-number-of-frogs-croaking/
public final class Croaking {

    public int minNumberOfFrogs(String croakOfFrogs) {
        final int[] indexes = new int[5];
        final String croak = "croak";
        int max = 0;
        int current = 0;
        for (final char c : croakOfFrogs.toCharArray()) {
            final int index = croak.indexOf(c);
            indexes[index]++;
            if (index == 0) {
                current++;
                max = Math.max(max, current);
            } else {
                indexes[index - 1]--;
                if (indexes[index - 1] < 0) {
                    return -1;
                } else if (index == 4) {
                    current--;
                }
            }
        }
        if (current == 0) {
            return max;
        } else{
            return -1;
        }
    }
}
