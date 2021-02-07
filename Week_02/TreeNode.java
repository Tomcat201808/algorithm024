/**
 * 
 */
package com.geek.week02;

/**
 * @author weifujun 定义一个二叉树
 * @version Created in 2021年2月6日 下午1:14:14
 */
public class TreeNode {

	// Definition for a binary tree node.

	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

}