/**
 * 
 */
package com.jk.shuati;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author weifujun
 *两数之和
 * @version Created in 2021年1月27日 下午10:43:35
 */
public class Solution001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[]a = {2,4,6,3,9,7};
		int[] array = twoSum(a,9);
		System.out.println(Arrays.toString(array));
//		for(int i=0;i<array.length;i++)
//		{
//		      System.out.print(array[i]+" ");
//		}
	}
    public static int[] twoSum(int[] nums, int target) {
    	Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i <= nums.length-1; i++){
            if ( map.containsKey(target-nums[i])) {
            	return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }   
        return new int[0];
    }
}
