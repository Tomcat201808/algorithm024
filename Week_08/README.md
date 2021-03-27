学习笔记



***一、位运算实战的要点***

1.判断奇数偶数

​    x%2 ==1  --->(x&1)==1

​    x%2 ==0  --->(x&1)==0

2.x>>1 --->x/2

​    即x=x/2  ---> x=x>>1;

​	这个在二分查找中随处可见：

​        mid = (right - left)/2 + left  --->    mid = ((right - left)>>1) + left;

3.X=X&(X-1)清零最低位的1

​	这个就更加厉害了，在统计一个数二进制表示的时候，有多少个1位，特别有用。

4.X&-X  可以得到最低位的1

5 X&(非X) =0



***二、N皇后去重判定法***

def solveNQueens(self ,n )
	def DFS(queens,xy_dif,xy_sum)
		p = len(queens)
		if p==n:
			result.append(queens)
			return None
		for q in range(n):
			if q not in queens and p-q not in xy_dif and p-q not in xy_sum:
				DFS(queens+[q],xy_dif+[p-q],xy_sum+[p+q]
		result = []
		DFS([],[],[])
		return[["."*i + "Q"+"."*(n-i-1)for i in sol] for sol in result]]



***三、N皇后位运算代码***

/**
 * */
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



***四、树的平衡问题***

AVL树和红黑树的概念：

1.概述： 

​	读操作非常非常多，写操作非常非常少的情况下，用AVL树，比如数据库，微博等；

​	写操作非常多或者插入和删除操作一半一半，读操作非常少用红黑树比如map，set等。 

2.AVL的结构相较于RB-Tree更为平衡，插入和删除引起失衡 ；

3.红黑树不追求"完全平衡"，即不像AVL那样要求节点的 `|balFact| <= 1`，它只要求部分达到平衡，但是提出了为节点增加颜色，红黑是用非严格的平衡来换取增删节点时候旋转次数的降低，任何不平衡都会在三次旋转之内解决，而AVL是严格平衡树，因此在增加或者删除节点的时候，根据不同情况，旋转的次数比红黑树要多。

4.就插入节点导致树失衡的情况，AVL和红黑树都是最多两次树旋转来实现复衡rebalance，旋转的量级是O(1)
 删除节点导致失衡，AVL需要维护从被删除节点到根节点root这条路径上所有节点的平衡，旋转的量级为O(logN)，而红黑树最多只需要旋转3次实现复衡，只需O(1)，所以说红黑树删除节点的rebalance的效率更高，开销更小！

综上述： 引入RB-Tree是**功能、性能、空间开销的折中结果** ：

 AVL更平衡，结构上更加直观，时间效能针对读取而言更高；维护稍慢，空间开销较大 ；

 红黑树，读取略逊于AVL，维护强于AVL，空间开销与AVL类似，内容极多时略优于AVL，维护优于AVL 。

 **红黑树有着良好的稳定性和完整的功能，性能表现也很不错，综合实力强**，在诸如STL的场景中需要稳定表现。 

