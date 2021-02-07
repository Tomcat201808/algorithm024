/**
 * 
 */
package com.geek.week02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weifujun 412. Fizz Buzz
 * @version Created in 2021年2月4日 下午8:45:53 本题意在考察list的运用
 */
public class FizzBuzz {
	public static void main(String[] args) {
		System.out.println(fizzBuzz(15));
	}

	public static List<String> fizzBuzz(int n) {
		// 定义一个链表，这个最为关键
		List<String> list = new ArrayList<String>();

		for (int i = 1; i <= n; i++) {
			boolean divThree = (i % 3 == 0);
			boolean divFive = (i % 5 == 0);
			// 这个放在第一个也是很关键的，放在后面会出问题
			if (divThree && divFive)
				list.add("FizzBuzz");
			else if (divThree)
				list.add("Fizz");
			else if (divFive)
				list.add("Buzz");
			else
				list.add(Integer.toString(i));
		}
		return list;
	}
}
