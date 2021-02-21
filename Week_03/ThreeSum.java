/**
 * 
 */
package com.geek.week03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author weifujun 15. 三数之和 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a
 *         + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 * @version Created in 2021年2月19日 下午8:56:32
 */
public class ThreeSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { -1,0,1,2,-1,-4};
		List<?> array = threeSum(a);
		System.out.println(array);
		
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		if (nums.length < 3)
			return new ArrayList();

		// 排序
		Arrays.sort(nums);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<List<Integer>> restListArray = new ArrayList();

		// 存入哈希表
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		Integer t;
		int target = 0;
		for (int i = 0; i < nums.length; i++) {
			target = -nums[i];

			// 去重
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			for (int j = i + 1; j < nums.length; ++j) {
				if (j > i + 1 && nums[j] == nums[j - 1]) {
					continue;
				}
				if ((t = map.get(target - nums[j])) != null) {
					// 符合要求的情况存入
					if (t > j) {
						restListArray.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[t])));
					} else {
						break;
					}
				}
			}
		}
		return restListArray;
	}

}
