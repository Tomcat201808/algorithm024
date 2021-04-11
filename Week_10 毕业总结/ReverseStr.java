/**
 * 
 */
package com.geek.week10;

/**
 * @author weifujun
 *
 * @version Created in 2021年4月11日 下午11:41:38
 */
public class ReverseStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcdefg";
		System.out.print(reverseStr(str, 2));

	}

	static String reverseStr(String s, int k) {
		char[] a = s.toCharArray();
		for (int start = 0; start < a.length; start += 2 * k) {
			int i = start, j = Math.min(start + k - 1, a.length - 1);
			while (i < j) {
				char tmp = a[i];
				a[i++] = a[j];
				a[j--] = tmp;
			}
		}
		return new String(a);
	}

}
