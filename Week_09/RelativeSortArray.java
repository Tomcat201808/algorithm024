/**
 * 
 */
package com.geek.week09;

import java.util.Arrays;

/**
 * @author weifujun 数组相对排序
 * @version Created in 2021年4月6日 上午1:12:02
 */
public class RelativeSortArray {
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		int k = 0;
		for (int i = 0; i < arr2.length; i++) {
			int value = arr2[i];
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[j] == value) {
					if (k == j) {
						k++;
					} else {
						int tmp = arr1[j];
						arr1[j] = arr1[k];
						arr1[k] = tmp;
						k++;
					}
				}
			}
		}
		Arrays.sort(arr1, k, arr1.length);
		return arr1;
	}
}
