/**
 * 
 */
package com.geek.week03;

/**
 * @author weifujun 剑指 Offer 68 - II. 二叉树的最近公共祖先
 * @version Created in 2021年2月18日 下午9:25:51
 */
public class LowestCommonAncestor {

	// 主要是使用递归的思维。分为4个步骤，1是列出终止条件，2是处理当前层次的逻辑，3是处理下一层的逻辑，4是状态处理
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || root == p || root == q)
			return root;
		TreeNode findLeftNode = lowestCommonAncestor(root.left, p, q);
		TreeNode findRigthNode = lowestCommonAncestor(root.right, p, q);

		if (findLeftNode == null)
			return findRigthNode;
		if (findRigthNode == null)
			return findLeftNode;

		return root;
	}

}
