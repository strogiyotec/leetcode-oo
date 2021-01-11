package leetcode.oo.strings;

public final class Kmp {
    public static void main(final String[] args) {
        final String line = "ABC ABCDAB ABCDABCDABDE";
        final String word = "ABCDABD";
        final int[] table = Kmp.table("ABCDABD");
        int i = 0;
        int j = 0;
        int startIndex = 0;
        while (i < line.length()) {
            boolean found = true;
            while (j < word.length()) {
                if (line.charAt(i) != word.charAt(j)) {
                    j = table[j - 1];
                    if (j == 0) {
                        i++;
                    }
                    found = false;
                    break;
                }
                i++;
                j++;
            }
            if (found) {
                System.out.println("FOunf");
                return;
            }
        }
        System.out.println("Not Found");
    }

    private static int[] table(final String word) {
        final int[] table = new int[word.length()];
        int i = 0;
        int j = 1;
        while (j < table.length) {
            if (word.charAt(i) == word.charAt(j)) {
                table[j++] = ++i;
            } else {
                table[j++] = 0;
            }
        }
        return table;
    }

}
