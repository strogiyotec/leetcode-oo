package leetcode.oo.arrays;

//https://leetcode.com/problems/find-the-student-that-will-replace-the-chalk/
public final class StudentChalk {

    public static void main(final String[] args) {
        System.out.println(
            new StudentChalk().chalkReplacer(
                new int[]{3, 4, 1, 2},
                25
            )
        );
        System.out.println(
            new StudentChalk().chalkReplacer(
                new int[]{5, 1, 5},
                22
            )
        );
    }

    public int chalkReplacer(final int[] chalk, final int k) {
        int currentChalks = k;
        int index = 0;
        while (true) {
            if (chalk[index] > currentChalks) {
                return index;
            }
            currentChalks -= chalk[index];
            index++;
            if (index == chalk.length) {
                index = 0;
            }
        }
    }
}
