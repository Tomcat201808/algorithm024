/**
 * 
 */
package com.geek.week02;

import com.geek.week02.TreeNode;

/**
 * @author weifujun
 * 104. 二叉树的最大深度
 * @version Created in 2021年2月6日 下午1:10:55
 */
public class MaxDepth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object[] data = { 3, 9, 20, null, null, 15, 7 };
		TreeNode tn = new TreeNode();

	}
	/**
	 * 树，主要是优先考虑递归，找到最小的重复单元，写递归代码
	 * @param root
	 * @return
	 */
	public static int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		else {
			int left = maxDepth(root.left);
			int right = maxDepth(root.right);
			return Math.max(left, right);
		}
	}
}
