/**
 * 
 */
package com.geek.week08;

/**
 * @author weifujun N皇后代码示例
 * @version Created in 2021年3月27日 下午1:32:02
 */
public class Solution_Nqueens {
	private int size;
	private int count;

	private void solve(int row, int ld, int rd) {
		if (row == size) {
			count++;
			return;
		}
		int pos = size & (~(row | ld | rd));
		while (pos != 0) {
			int p = pos & (-pos);
			pos -= p;
			solve(row | p, (ld | p) << 1, (rd | p) >> 1);
		}
	}

	public int totalNQueens(int n) {
		count = 0;
		size = (1 << n) - 1;
		solve(0, 0, 0);
		return count;
	}

}
