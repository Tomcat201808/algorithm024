/**
 * 
 */
package com.geek.week04;

/**
 * @author weifujun 122. 买卖股票的最佳时机 II
 * @version Created in 2021年2月24日 下午11:21:31
 */
public class MaxProfit {

	public static void main(String[] args) {
		int array[] = { 13, 8, 9, 7, 18, 23, 35, 0 };
		int res = maxProfit(array);
		int res2 = maxProfit2(array);
		System.out.println(res);
		System.out.println(res2);
	}

//	贪心法
	public static int maxProfit(int[] prices) {
		int len = prices.length;
		if (len < 2) {
			return 0;
		}

		int res = 0;
		for (int i = 1; i < len; i++) {
			res += Math.max(prices[i] - prices[i - 1], 0);
		}
		return res;
	}

//	贪心等价法
	public static int maxProfit2(int[] prices) {
		int len = prices.length;
		if (len < 2) {
			return 0;
		}

		int res = 0;
		for (int i = 1; i < len; i++) {
			int diff = prices[i] - prices[i - 1];
			if (diff > 0) {
				res += diff;
			}
		}
		return res;
	}

}
