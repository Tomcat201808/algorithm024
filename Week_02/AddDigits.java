/**
 * 
 */
package com.geek.week02;

/**
 * @author weifujun 258. 各位相加
 * @version Created in 2021年2月4日 下午9:39:10
 */
public class AddDigits {

	public static void main(String[] args) {
		System.out.println(addDigits(139894369));
		System.out.print(addDigits2(555));
	}

	public static int addDigits(int num) {
		// 这个，虽然不理解，但是先背下来，再理解吧
		return (num - 1) % 9 + 1;
	}

	public static int addDigits2(int num) {
		// 常规的办法--递归法
		if (num < 10)
			return num;
		int next = 0;
		while (num != 0) {
			next = next + num % 10;
			num /= 10;
		}
		return addDigits2(next);
	}
}
