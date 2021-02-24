/**
 * 
 */
package com.geek.week04;

/**
 * @author weifujun 二分查找模板
 * @version Created in 2021年2月23日 下午10:49:53
 */
public class BinarySearch {

	public static void main(String[] args) {
		int array[] = { 1, 3, 6, 7, 18, 23, 35, 48 };
		int res = binarySearch(array, 1);
		System.out.println(res);
		int res1 = binarySearch(array, 18);
		System.out.println(res1);
		int res2 = binarySearch(array, 18);
		System.out.println(res2);
		int res3 = binarySearch(array, 10);
		System.out.println(res3);
	}

	public static int binarySearch(int array[], int target) {
		int left = 0, mid, right = array.length - 1;
		while (left <= right) { // 这个等于号，差点害死人
			mid = (right - left) / 2 + left; // 这个处理，给满分！
			// 如果查找的数据和中间的数据相等，则返回
			if (array[mid] == target)
				return mid;
			// 如果查找的数据在右半边，则左边指针是中位加一
			else if (array[mid] < target) {
				left = mid + 1;
				// 否则，就是查找的目标数据在左边，则右指针是中位减一
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

}
