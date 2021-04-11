/**
 * 
 */
package com.geek.week10;

/**
 * @author weifujun
 * 字符串中第一个唯一字符
 * @version Created in 2021年4月11日 下午11:39:52
 */
public class FirstUniqChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++)
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
                return i;
        return -1;
    }
}
