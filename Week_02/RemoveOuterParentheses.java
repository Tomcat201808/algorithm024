/**
 * 
 */
package com.geek.week02;

/**
 * @author weifujun 1021. 删除最外层的括号
 * @version Created in 2021年2月3日 下午10:57:23
 */
public class RemoveOuterParentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "(()())";
		System.out.print(removeOuterParentheses(str));

	}

	public static String removeOuterParentheses(String S) {
		StringBuilder sb = new StringBuilder();
		int level = 0;
		for (char c : S.toCharArray()) {
			if (c == ')')
				--level;
			if (level >= 1)
				sb.append(c);
			if (c == '(')
				++level;
		}
		return sb.toString();
	}

}
