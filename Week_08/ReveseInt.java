/**
 * 
 */
package com.geek.week08;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author weifujun 反转整数
 * @version Created in 2021年3月25日 下午9:43:25
 */
public class ReveseInt {

	public static void reveseint(int nums) {
		String str = null;
		str = String.valueOf(nums);
		char[] strChars = str.toCharArray();
		int len = strChars.length;
		char[] reverseChars = new char[len];
		for (int i = 0; i < len; i++) {
			reverseChars[i] = strChars[len - 1 - i];
		}
		System.out.print(new String(reverseChars));
	}

	public static void reveseint2(int nums) throws IOException {
		InputStream stream = System.in;
		int len;
		byte[] bytes = new byte[1024];
		while ((len = stream.read(bytes)) > 0) {
			String str = new String(bytes, 0, len - 1);
			char[] chars = str.toCharArray();
			char[] reverseChars = new char[chars.length];
			for (int i = 0; i < chars.length; i++) {
				reverseChars[i] = chars[chars.length - 1 - i];
			}
			System.out.println(new String(reverseChars));
		}
	}

	// 取模求和,这个才是贴近本质
	public static int reverseBits3(int nums) {
		int res = 0;
		for (int i = 0; i < 32; i++) {
			res = (res << 1) + (nums & 1);
			nums = (nums >> 1);
		}
		return res;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// reveseint(123342343);
		reveseint2(123342343);
		System.out.println();
		System.out.println(reverseBits3(10));
	}
}

