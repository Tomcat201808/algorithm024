/**
 * 
 */
package com.geek.week09;

/**
 * @author weifujun 手撕快速排序
 * @version Created in 2021年4月1日 下午9:25:28
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 45, 23, 1, 22, 3, 98, 100, 54, 78 };
		quicksort2(a, 0, a.length - 1);
		for (int array : a) {
			System.out.print(array + " ");
		}

	}

	public static void quicksort(int arr[], int low, int hight) {
		if (hight > low) {
			int poivt = partition3(arr, low, hight);
			quicksort(arr, low, poivt - 1);
			quicksort(arr, poivt + 1, hight);
		}
	}

	public static int partition(int array[], int left, int right) {
		if (right <= left || array == null)
			return 0;
		int pValue = array[left];
		while (left < right) {
			while (left < right && array[right] >= pValue)
				right--;
			swap(array, left, right);
			while (left < right && array[left] <= pValue)
				left++;
			swap(array, left, right);
		}
		return left;

	}

	// 两数交换的常规办法
	static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void quicksort2(int arr[], int low, int hight) {
		if (hight > low) {
			int poivt = partition2(arr, low, hight);
			quicksort2(arr, low, poivt - 1);
			quicksort2(arr, poivt + 1, hight);
		}
	}

	static int partition2(int a[], int p, int r) {
		int x = a[r];
		int i = p - 1;
		for (int j = p; j <= r - 1; j++) {
			if (a[j] <= x) {
				i++;
				swap(a, i, j);
			}
		}
		swap(a, i + 1, r);
		return i + 1;
	}

	// 两数交换，不用增加额外的空间也能解决两个数据交换的问题
	static void swap2(int a[], int i, int j) {
		a[i] = a[i] ^ a[j];
		a[j] = a[i] ^ a[j];
		a[i] = a[i] ^ a[j];
	}

	//手写快排，这个分区函数，是快排的核心
	static int partition3(int a[], int p, int r) {
		int x = a[r];
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (x >= a[j]) {
				i++;
				swap2(a, i, j);
			}
		}
		swap2(a, i + 1, r);
		return i + 1;
	}

}
