学习笔记



1.分治代码的模板：


def divide_conquer(problem,param1,param2,...):

recursion terminator

​	if problem is None:
​		print_result
​		return

prepare data

​	data = prepare_data(problem)
​	subproblems = split_problem(problem,data)
​	

	# conquar subproblems
	subresult1 = self.divide_conquer(subproblems[0],p1,...)
	subresult2 = self.divide_conquer(subproblems[1],p1,...)
	subresult3 = self.divide_conquer(subproblems[2],p1,...)
	
	# process  and generate the final result
	result = process_result(subresult1,subresult2,subresult3,...)
	
	# revert the current level states


2.递归的本质：寻找重复性，其实就是找到最大的公约数，这就是计算机指令集

3.动态规划 Dynamic Programming
    1)Simplifying a complicated problem by breaking it down into simpler
    sub-problems (in a recursive manner)
    2)Divide & Conquer + Optimal substructure
        分治+最优子结构
    3) 顺推形式：动态递推
    
 DP 顺推模板
    function DP():
        dp = [][] #二维情况
        for i = 0...M{
            for j = 0...N{
                dp[i][j]=_Function(dp[i-1][j-1]...)
            }
        }
        return dp[M][N];
难点：1）dp状态的定义，这里非常吃经验，同时需要把一个现实的问题定义成一个数组，里面用来保存状态，这里面可能是一维二维三维的；
      2）第二个复杂的地方是状态转移方程要怎么写。比如斐波那契数列，爬楼梯等简单的问题较容易，但是更多的情况下，我们会求一个最小值或者最大值，或者我们可以累加累减，或者里面有一层小的循环，从之前的K个状态中找到她的最值。
        
关键点：动态规划和递归或者分治其实没有本质的区别（关键看有无最优的子结构）
拥有共性：找到重复子问题
差异性：最优子结构、中途可以淘汰次优解

