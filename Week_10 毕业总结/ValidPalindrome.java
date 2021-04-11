/**
 * 
 */
package com.geek.week10;

/**
 * @author weifujun 验证回文字符串
 * @version Created in 2021年4月11日 下午11:45:13
 */
public class ValidPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validPalindrome("abcddjsdkd"));
		System.out.print(validPalindrome("abca"));

	}

	static boolean validPalindrome(String s) {
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				// 分两种情况，一是右边减一，二是左边加一
				return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
			}
		}
		return true;
	}

	static boolean isPalindrome(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i++) != s.charAt(j--)) {
				return false;
			}
		}
		return true;
	}

}
