package leetcode.oo.tree;

//https://leetcode.com/problems/trim-a-binary-search-tree/
 final class TrimBinaryTree {

     PlainTree trimBST(final PlainTree root, final int low, final int high) {
        if (root == null) {
            return null;
        }
        if (root.val > high) {
            return this.trimBST(root.left, low, high);
        }
        if(root.val < low){
            return this.trimBST(root.right,low,high);
        }
        root.left = this.trimBST(root.left,low,high);
        root.right = this.trimBST(root.right,low,high);
        return root;
    }
}
