package leetcode.oo.tree;

//https://leetcode.com/problems/binary-tree-cameras/
final class BinaryTreeCameras {

    int minCameraCover(final PlainTree root) {
        final Status dfs = this.dfs(root);
        if (dfs.state == State.NOT) {
            dfs.cameras++;
        }
        return dfs.cameras;
    }

    private Status dfs(final PlainTree root) {
        if (root == null) {
            return new Status(State.MONITORED, 0);
        }
        final Status left = this.dfs(root.left);
        final Status right = this.dfs(root.right);
        final Status current = new Status(State.NOT, left.cameras + right.cameras);
        if (left.state == State.NOT || right.state == State.NOT) {
            current.state = State.CAMERA;
            current.cameras++;
        } else if (left.state == State.CAMERA || right.state == State.CAMERA) {
            current.state = State.MONITORED;
        }
        return current;
    }

    private enum State {
        MONITORED, NOT, CAMERA
    }

    private static class Status {
        BinaryTreeCameras.State state;

        int cameras;

        public Status(final BinaryTreeCameras.State state, final int cameras) {
            this.state = state;
            this.cameras = cameras;
        }

    }
}
