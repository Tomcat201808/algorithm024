/**
 * 
 */
package com.geek.week02;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author weifujun 94. 二叉树的中序遍历
 * @version Created in 2021年2月7日 下午6:14:41
 */
public class InorderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		inorder(root, res);
		return res;
	}

	// 方法一：使用递归法
	public void inorder(TreeNode root, List<Integer> res) {
		if (root == null) {
			return;
		}
		inorder(root.left, res);
		res.add(root.val);
		inorder(root.right, res);
	}

	// 方法二：使用迭代法
	public List<Integer> inorderTraversal2(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		Deque<TreeNode> stk = new LinkedList<TreeNode>();
		while (root != null || !stk.isEmpty()) {
			while (root != null) {
				stk.push(root);
				root = root.left;
			}
			root = stk.pop();
			res.add(root.val);
			root = root.right;
		}
		return res;
	}

}
