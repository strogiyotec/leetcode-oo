package leetcode.oo.tree;

//https://leetcode.com/problems/binary-tree-cameras/
final class BinaryTreeCameras {

    int minCameraCover(final PlainTree root) {
        final int[] cnt = new int[1];
        final State dfs = this.dfs(root, cnt);
        if (dfs == State.NOT) {
            cnt[0]++;
        }
        return cnt[0];
    }

    private State dfs(final PlainTree root, final int[] cnt) {
        if (root == null) {
            return State.MONITORED;
        }
        final State left = this.dfs(root.left, cnt);
        final State right = this.dfs(root.right, cnt);
        State current = State.NOT;
        if (left == State.NOT || right == State.NOT) {
            cnt[0]++;
            current = State.CAMERA;
        } else if (left == State.CAMERA || right == State.CAMERA) {
            current = State.MONITORED;
        }
        return current;
    }

    private enum State {
        MONITORED, NOT, CAMERA
    }
}
