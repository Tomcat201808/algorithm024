/**
 * 
 */
package com.geek.week08;

/**
 * @author weifujun 比特位计数
 * @version Created in 2021年3月27日 下午1:45:15
 */
public class CountBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = countBits(5);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + ",");

	}

	// 采用动态规划方法，最低位设置为有效
	public static int[] countBits(int nums) {
		int bits[] = new int[nums + 1];
		for (int i = 1; i <= nums; i++) {
			bits[i] = bits[i >> 1] + (i & 1);  //动归的DP方程
		}
		return bits;
	}
}
