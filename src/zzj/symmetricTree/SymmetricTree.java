package zzj.symmetricTree;

import zzj.util.TreeNode;

/**
 * Given a binary tree, check whether it is a mirror of itself 
 * (ie, symmetric around its center).

For example, this binary tree is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3

But the following is not:

    1
   / \
  2   2
   \   \
   3    3

 * @author Administrator
 *
 */

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if (root.left != null && root.right != null 
				&& root.left.val == root.right.val) {
			
		}
        return false;
    }
}


