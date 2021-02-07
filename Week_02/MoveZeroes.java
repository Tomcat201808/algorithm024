/**
 * 
 */
package com.geek.week02;

import java.util.Arrays;

/**
 * @author weifujun 283. 移动零 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * @version Created in 2021年2月7日 下午5:28:42
 */
public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 0, 3, -1, -3, 0, 3, 6, 1 };
		moveZeroes(a);
		System.out.print(Arrays.toString(a));

	}

	public static void moveZeroes(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int tmp = nums[i];
				nums[i] = nums[j];
				nums[j] = tmp;

				j++;
			}

		}

	}
}
