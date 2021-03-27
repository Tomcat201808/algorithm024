/**
 * 
 */
package com.geek.week08;

/**
 * @author weifujun 位1的个数
 * @version Created in 2021年3月27日 上午11:51:52
 */
public class HammingWeight {

	public static void main(String[] args) {
		System.out.print(hammingWeight(17));
		System.out.print(hammingWeight2(0));
		System.out.print(hammingWeight2(17));
		System.out.print(hammingWeight2(1024));
		System.out.print(hammingWeight2(1025));
		System.out.println();
		System.out.print(hammingWeight3(17));
		System.out.print(hammingWeight3(0));
		System.out.print(hammingWeight3(17));
		System.out.print(hammingWeight3(1024));
		System.out.print(hammingWeight3(1025));
		System.out.println();
		System.out.print(hammingWeight4(17));
		System.out.print(hammingWeight4(0));
		System.out.print(hammingWeight4(17));
		System.out.print(hammingWeight4(1024));
		System.out.print(hammingWeight4(1025));
	}

	// 这是最高效的做法。主要是使用了清零最低位的1的做法（x=x&(n-1))，这个要作为重点的背诵对象
	public static int hammingWeight(int n) {
		int count = 0;
		while (n > 0) {
			n = n & (n - 1);
			count++;
		}
		return count;
	}

	// 这是一般%2的方法。普通人都可以想得到的
	public static int hammingWeight2(int n) {
		int count = 0;
		while (n > 0) {
			if (n % 2 == 1)
				count++;
			n = n / 2;
		}
		return count;
	}

	// 这是第三种方法。主要是使用右移的方法，学了位运算的人都可以写出这样的代码来
	public static int hammingWeight3(int n) {
		int count = 0;
		while (n > 0) {
			if ((n & 1) == 1)
				count++;
			n = n >> 1;
		}
		return count;
	}

	// 这是第4种方法。直接用递归吧,这个才是真正的计算机思维
	public static int hammingWeight4(int n) {
		return (n > 0) ? 1 + hammingWeight4(n & (n - 1)) : 0;
	}

}
