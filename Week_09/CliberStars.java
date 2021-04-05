/**
 * 
 */
package com.geek.week09;

/**
 * @author weifujun 爬楼梯问题，用动归解决
 * @version Created in 2021年4月5日 下午7:48:18
 */
public class CliberStars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(cliberStars(0));
		System.out.println(climbStairs(1));
		System.out.println(climbStairs2(2));
		System.out.println(climbStairs(3));
		System.out.println(climbStairs2(4));
		System.out.println(climbStairs(5));

	}

	// 1.最好的动归方法，没有之一
	static int climbStairs(int n) {
		int dp[] = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 2] + dp[i - 1];
		}
		return dp[n];
	}

	// 2.使用这样的方法，就非常吃技巧了，不提倡
	public static int climbStairs2(int n) {
		int a = 0, b = 0, c = 1;
		for (int i = 1; i <= n; ++i) {
			b = a;
			a = c;
			c = a + b;
		}
		return c;
	}
}
