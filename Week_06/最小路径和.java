/**
解题思路：
此题是典型的动态规划题目。

状态定义：
设 dp 为大小 m×n 矩阵，其中 dp[i][j] 的值代表直到走到 (i,j) 的最小路径和。

转移方程：
题目要求，只能向右或向下走，换句话说，当前单元格 (i,j) 只能从左方单元格 (i-1,j) 或上方单元格 (i,j-1)走到，因此只需要考虑矩阵左边界和上边界。

初始状态：
dp 初始化即可，不需要修改初始 0 值。

返回值：
返回 dp 矩阵右下角值，即走到终点的最小路径和。

复杂度分析：
时间复杂度 O(M×N) ： 遍历整个 grid 矩阵元素。
空间复杂度 O(1) ： 直接修改原矩阵，不使用额外空间。
**/

class Solution {
    public int minPathSum(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(i == 0 && j == 0) continue;
                else if(i == 0)  grid[i][j] = grid[i][j - 1] + grid[i][j];
                else if(j == 0)  grid[i][j] = grid[i - 1][j] + grid[i][j];
                else grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}
