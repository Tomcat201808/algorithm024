/**
 * 
 */
package com.geek.week09;

/**
 * @author weifujun 字符串中第一个唯一字符。
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * @version Created in 2021年3月29日 上午9:03:10
 */
public class FirstUniqChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// 方法一：利用Java的api，这个虽然有点胜之不武，但是还是完美的解决了问题
	public static int firstUniqChar1(String s) {
		for (int i = 0; i < s.length(); i++)
			if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
				return i;
		return -1;
	}

}
