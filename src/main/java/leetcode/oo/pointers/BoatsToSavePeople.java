package leetcode.oo.pointers;

import java.util.Arrays;

//https://leetcode.com/problems/boats-to-save-people/
public final class BoatsToSavePeople {

    public static void main(String[] args) {
        System.out.println(new BoatsToSavePeople().numRescueBoats(
            new int[]{3, 2, 2, 1}, 3
        ));
    }

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int cnt = 0;
        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            if (people[right] + people[left] <= limit) {
                left++;
            }
            right--;
            cnt++;
        }
        return cnt;
    }
}
