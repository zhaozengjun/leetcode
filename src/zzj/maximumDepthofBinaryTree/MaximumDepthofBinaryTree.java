package zzj.maximumDepthofBinaryTree;

import zzj.util.TreeNode;


/**
 * Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path 
from the root node down to the farthest leaf node.
 * @author Administrator
 *
 public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
 */
public class MaximumDepthofBinaryTree {
	
    public int maxDepth(TreeNode root) {
    	int depth = 0;
    	if (root != null) {
	        int left = maxDepth(root.left);
	        int right = maxDepth(root.right);
	        depth = 1 + Math.max(left, right);
		}
    	return depth;
    }
    
    public int maxDepth_1(TreeNode root) {
    	return root == null?0:1+Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    
    
    
    
    
    public static void main(String[] args) {
		
		
		
		
	}
    
}