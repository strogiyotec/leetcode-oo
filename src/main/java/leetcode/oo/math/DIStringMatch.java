package leetcode.oo.math;

final class DIStringMatch {

    int[] diStringMatch(final String word) {
        final int[] permut = new int[word.length() + 1];
        int right = word.length();
        int left = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'I') {
                permut[i] = left++;
            } else {
                permut[i] = right--;
            }
        }
        if (word.charAt(word.length() - 1) == 'I') {
            permut[word.length()] = left;
        } else {
            permut[word.length()] = right;
        }
        return permut;
    }
}
