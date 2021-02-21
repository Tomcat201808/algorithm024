/**
 * 
 */
package com.geek.week03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author weifujun 1. 两数之和
 * @version Created in 2021年2月19日 下午8:40:28
 */
public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 4, 6, 3, 9, 7 };
		int[] array = twoSum(a, 9);
		System.out.println(Arrays.toString(array));
		
		

	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> hasmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (hasmap.containsKey(target - nums[i])) {
				// hasmap.put(i, nums[i]);
				return new int[] { hasmap.get(target - nums[i]), i };
			}
			hasmap.put(nums[i], i);
		}

		return null;
	}

}
