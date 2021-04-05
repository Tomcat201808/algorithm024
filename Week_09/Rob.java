/**
 * 
 */
package com.geek.week09;

/**
 * @author weifujun 打家劫舍
 * @version Created in 2021年4月04日 下午11:20:01
 */
public class Rob {

	// 主要是采用了动态规划的思想，找到DP方程，即可实现。还有一个就是初始化和i=2的取值，一定要想清楚这些边界条件
	public static int rob(int nums[]) {
		if (nums.length == 0)
			return 0;
		int n = nums.length;
		int dp[] = new int[n + 1];
		dp[0] = 0;
		dp[1] = nums[0];
		for (int i = 2; i <= n; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
		}
		return dp[n];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 1 };
		System.out.println(rob(arr));
	}
}
