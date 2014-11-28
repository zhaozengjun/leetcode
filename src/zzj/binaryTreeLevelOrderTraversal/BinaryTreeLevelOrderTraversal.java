package zzj.binaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;

import zzj.util.TreeNode;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree {3,9,20,#,#,15,7},

    3
   / \
  9  20
    /  \
   15   7

return its level order traversal as:

[
  [3],
  [9,20],
  [15,7]
]


 * @author Administrator
 *
 */
public class BinaryTreeLevelOrderTraversal {
	List<List<Integer>> list = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
		List<Integer> list2 = new ArrayList<Integer>();
    	if (root != null) {
			list2.add(root.val);
			list.add(list2);
			getChildren(root);
		}
        return list;
    }
    
    
    public void getChildren(TreeNode childNode){
    	List<Integer> clist = null;
    	if (childNode != null) {
    		clist = new ArrayList<Integer>();
        	if (childNode.left != null) {
        		clist.add(childNode.left.val);
    		}
    		if (childNode.right != null) {
    			clist.add(childNode.right.val);
    		}
    		if (clist != null && clist.size() > 0) {
    			list.add(clist);
        		getChildren(childNode.left);
        		getChildren(childNode.right);
			}
		}
    }
    
    
}
