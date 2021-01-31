/**
 * 
 */
package com.jk.shuati;

/**
 * @author weifujun
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
     最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
     你可以假设除了整数 0 之外，这个整数不会以零开头
 * @version Created in 2021年1月26日 下午11:13:39
 */
public class Solution066 {
	public static void main(String[] args) {
        int []a= {9,9,9};
		int []array=  plusOne(a);
		for(int i=0;i<array.length;i++)
		{
		      System.out.print(array[i]);
		}
	}
	 public static int[] plusOne(int[] digits) {
		 
		 for (int i =digits.length - 1 ;i>=0; i-- ) {
			 digits[i]++;
			 digits[i] %= 10 ;
			 if (digits[i] != 0 ) return digits;
		 }
		 digits = new int[digits.length + 1] ;
		 digits[0] = 1;	 
		 return digits;
	 } 
}
