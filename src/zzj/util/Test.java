package zzj.util;

import java.util.List;

import zzj.binaryTreeLevelOrderTraversal.BinaryTreeLevelOrderTraversal;
import zzj.maximumDepthofBinaryTree.MaximumDepthofBinaryTree;

public class Test {
	static TreeNode rootNode = new TreeNode(1);
	
	static {
		TreeNode t11 = new TreeNode(2);
		TreeNode t12 = new TreeNode(2);
		rootNode.left = t11;
		rootNode.right = t12;
		
		TreeNode t111 = new TreeNode(3);
		TreeNode t112 = new TreeNode(3);
		t11.left = t111;
		t11.right = t112;
		
		TreeNode t1111 = new TreeNode(5);
		TreeNode t1112 = new TreeNode(51);
		t111.left = t1111;
		t111.right = t1112;
		
		TreeNode t11111 = new TreeNode(5);
		TreeNode t11112 = new TreeNode(5);
		t1111.left = t11111;
		t1111.right = t11112;
		
		TreeNode t121 = new TreeNode(3);
		TreeNode t122 = new TreeNode(3);
		t12.left = t121;
		t12.right = t122;
		
		TreeNode t1222 = new TreeNode(4);
		t122.right = t1222;
		
	}
	
	public static void main(String[] args) {

		int depth = new MaximumDepthofBinaryTree().maxDepth_1(rootNode);
		System.out.println(depth);
		
		List<List<Integer>> list = 
				new BinaryTreeLevelOrderTraversal().levelOrder(rootNode);
		System.out.println(list);
		
	}
}
