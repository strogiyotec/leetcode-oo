package leetcode.oo.strings;

//https://leetcode.com/problems/compare-version-numbers/
public final class RevisionCompare {

    public static void main(String[] args) {
        System.out.println(new RevisionCompare().compareVersion(
            "1.0.1",
            "1"
        ));
    }

    public int compareVersion(final String version1, final String version2) {
        final String[] firstRev = version1.split("\\.");
        final String[] secondRev = version2.split("\\.");
        int firstIndex = 0;
        int secondIndex = 0;
        while (firstIndex < firstRev.length || secondIndex < secondRev.length) {
            final int first = this.getRevision(firstIndex, firstRev);
            final int second = this.getRevision(secondIndex, secondRev);
            if (first < second) {
                return -1;
            }
            if (first > second) {
                return 1;
            }
            firstIndex++;
            secondIndex++;
        }
        return 0;
    }

    private int getRevision(final int index, final String[] rev) {
        if (index >= rev.length) {
            return 0;
        } else {
            return Integer.parseInt(rev[index]);
        }
    }
}
