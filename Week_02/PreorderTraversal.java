/**
 * 
 */
package com.geek.week02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weifujun 144. 二叉树的前中后序遍历
 * @version Created in 2021年2月7日 下午6:20:30
 */
public class PreorderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// 方法一：使用递归,得到前序遍历
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		preorder(root, res);
		return res;
	}

	public void preorder(TreeNode root, List<Integer> res) {
		if (root == null) {
			return;
		}
		res.add(root.val);
		preorder(root.left, res);
		preorder(root.right, res);
	}

	// 同理可得中序遍历
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		inorder(root, res);
		return res;
	}

	public void inorder(TreeNode root, List<Integer> res) {
		if (root == null) {
			return;
		}
		inorder(root.left, res);
		res.add(root.val);
		inorder(root.right, res);
	}

	// 同理可得后序遍历
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		postorder(root, res);
		return res;
	}

	public void postorder(TreeNode root, List<Integer> res) {
		if (root == null) {
			return;
		}
		postorder(root.left, res);
		postorder(root.right, res);
		res.add(root.val);
	}

}
