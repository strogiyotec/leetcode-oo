package leetcode.oo.dp.dfs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ProcessRestrictedFriendsTestCase {

    private FriendRequest alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new FriendRequest();
    }

    @Test
    public void test(){
        Assert.assertArrayEquals(
            new boolean[]{true,false,true,false},
            this.alg.friendRequests(
                5,
                new int[][]{
                    {0, 1}, {1, 2}, {2, 3}
                },
                new int[][]{
                    {0, 4}, {1, 2}, {3, 1}, {3, 4}
                }
            )

        );
    }
}
