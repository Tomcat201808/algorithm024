/**
 * 
 */
package com.jk.shuati;
/**
 * @author weifujun
 * 爬楼梯问题
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
      每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
      注意：给定 n 是一个正整数。
 * @version Created in 2021年1月25日 下午8:16:28
 */
public class Solution070 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(climbStairs(5));
	}
	public static int climbStairs(int n) {
        int a=0,b=0,c=1;
        for(int i =1;i<=n;++i){
            a=b;
            b=c;
            c=a+b;
        }
        return c;
	}
}
