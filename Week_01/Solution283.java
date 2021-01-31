/**
 * 
 */
package com.jk.shuati;

//import java.util.Arrays;

/**
 * @author weifujun
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序
 * @version Created in 2021年1月30日 下午7:45:05
 */
public class Solution283 {

	public void moveZeroes(int[] nums) {
        //定义双指针，j是慢指针，会指向是值零的下标
		int j = 0;
		for (int i =0; i< nums.length ; i++) {
			//i不等于0就往前挪动
			if (nums[i]!=0) {
				//交换i和j指向的值
				int tmp=nums[i];
				nums[i]=nums[j];
				nums[j]=tmp;
				
//				j的指针一定要加一
				j++;
			}
		}
	}
}
