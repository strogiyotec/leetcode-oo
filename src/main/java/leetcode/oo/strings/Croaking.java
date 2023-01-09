package leetcode.oo.strings;

//https://leetcode.com/problems/minimum-number-of-frogs-croaking/
public final class Croaking {

    public int minNumberOfFrogs(String croakOfFrogs) {
        final String croak = "croak";
        final int[] cnt = new int[croak.length()];
        int currentFrog = 0;
        int maxFrogs = 0;
        for (final char c : croakOfFrogs.toCharArray()) {
            final int index = croak.indexOf(c);
            cnt[index]++;
            maxFrogs = Math.max(maxFrogs, currentFrog);
            if (index == 0) {
                currentFrog++;
            } else {
                cnt[index - 1]--;
                if (cnt[index - 1] < 0) {
                    return -1;
                }
                if (index == 4) {
                    currentFrog--;
                }
            }
        }
        if(currentFrog == 0){
            return maxFrogs;
        } else{
            return -1;
        }
    }
}
