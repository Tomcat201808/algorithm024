/**
 * 
 */
package com.geek.week07;

/**
 * @author weifujun 爬楼梯问题，算是理解和默写窦都没有问题了，面对考试和机试，都没有任何问题
 * @version Created in 2021年3月21日 上午11:40:06
 */
public class CliberStairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(climbStairs(1));
		System.out.println(climbStairs3(2));
		System.out.println(climbStairs(3));
		System.out.println(climbStairs(4));
		System.out.println(climbStairs(5));
		System.out.println("================");
		System.out.println(climbStairs(6));
		System.out.println(climbStairs2(6));
		System.out.println(climbStairs3(6));
		System.out.println(climbStairs3(6));
		System.out.println(climbStairs(6));
		
		
		
	}

	// 这种方法比较讨巧，使用了一次循环就搞定了，这当然非常好，只是不好理解罢了
	public static int climbStairs(int n) {
		int a = 0, b = 0, c = 1;
		for (int i = 1; i <= n; i++) {
			a = b;
			b = c;
			c = a + b;
		}
		return c;
	}

	// 2.递归法： 这里使用类似于斐波那契那个递推公式进行求解，个人以为这个是最好的思路，但是对于计算机其实并不友好，哈哈
	public static int climbStairs2(int n) {
		return n <= 1 ? 1 : climbStairs2(n - 1) + climbStairs2(n - 2);
	}

	// 3.动态规划，关键找到DP方程，哎，不就是递推公式嘛，容易
	public static int climbStairs3(int n) {
		int dp[] = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= n; i++)
			dp[i] = dp[i - 1] + dp[i - 2]; //这是递推式的核心所在，也就是所谓的状态方程
		return dp[n];
	}

}
