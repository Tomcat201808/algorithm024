package com.geek.week09;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javafx.util.Pair;

/**
 * @author weifujun 不同路径问题
 * @version Created in 2021年4月5日 下午7:32:18
 */
public class UniquePaths {

	/**
	 * @param args
	 *            个人感觉吧，还是第二种比较容易理解，也只有第二种才能够自己写出来。虽然第三种是比较巧妙，但其实有太多的技巧，不太实用
	 */
	public static void main(String[] args) {
		System.out.println(uniquePaths(7, 3));
		System.out.println(uniquePaths2(7, 3));
		System.out.println(uniquePaths3(7, 3));
	}

	// 1.单纯使用递归方法
	public static int uniquePaths(int m, int n) {
		return dfs(new HashMap<Pair, Integer>(), 0, 0, m, n);
	}

	private static int dfs(Map<Pair, Integer> cache, int i, int j, int m, int n) {
		Pair p = new Pair(i, j);
		// 如果(i,j)在缓存中则直接返回
		if (cache.containsKey(p)) {
			return cache.get(p);
		}
		// 到达边界时，返回 1
		if (i == m - 1 || j == n - 1) {
			return 1;
		}
		// 继续递归调用，往下i+1，往右j+1
		cache.put(p, dfs(cache, i + 1, j, m, n) + dfs(cache, i, j + 1, m, n));
		return cache.get(p);
	}

	// 2.使用动态规划
	public static int uniquePaths2(int m, int n) {
		int[][] dp = new int[m][n];
		// 第一行都赋予 1
		for (int i = 0; i < m; ++i) {
			dp[i][0] = 1;
		}
		// 第一列都赋予 1
		for (int j = 0; j < n; ++j) {
			dp[0][j] = 1;
		}
		// 两个for循环推导，对于(i,j)来说，只能由上方或者左方转移过来
		for (int i = 1; i < m; ++i) {
			for (int j = 1; j < n; ++j) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}
		return dp[m - 1][n - 1];
	}

	// 3.动态规划+空间优化
	public static int uniquePaths3(int m, int n) {
		// 一维空间，其大小为 n
		int[] dp = new int[n];
		Arrays.fill(dp, 1);
		for (int i = 1; i < m; ++i) {
			for (int j = 1; j < n; ++j) {
				// 等式右边的 dp[j]是上一次计算后的，加上左边的dp[j-1]即为当前结果
				dp[j] = dp[j] + dp[j - 1];
			}
		}
		return dp[n - 1];
	}
}
