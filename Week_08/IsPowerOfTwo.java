/**
 * 
 */
package com.geek.week08;

/**
 * @author weifujun 2的幂
 * @version Created in 2021年3月27日 下午12:37:01
 */
public class IsPowerOfTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfTwo(0));
		System.out.println(isPowerOfTwo(1));
		System.out.println(isPowerOfTwo(7));
		System.out.println(isPowerOfTwo(16));
		System.out.println("=========");
		System.out.println(isPowerOfTwo(0));
		System.out.println(isPowerOfTwo(1));
		System.out.println(isPowerOfTwo(7));
		System.out.println(isPowerOfTwo(16));

	}

	// 关键是打掉最低位的1是0 即可，加油！
	public static boolean isPowerOfTwo(int n) {
		if (n > 0 && (n & (n - 1)) == 0)
			return true;
		else
			return false;
	}

	// 就是一行代码的问题呀
	public static boolean isPowerOfTwo2(int n) {
		return (n != 0) && (n & (n - 1)) == 0;
	}
}
