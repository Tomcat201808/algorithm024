学习笔记

***Haspmap***

- haspmap 的几个重要参数:
- DEFAULT_INITIAL_CAPACITY(默认初始化容量)：1<<4:16 ,必须是2^n
- MAXIMUM_CAPACITY(最大容量) 1<<30: 10亿级
- TREEIFY_THRESHOLD = 8;（当linked list 数量大于这个值时，会使用树保存（发生hash碰撞时，使用linked list 解决，为了避免linked list O(n)时间复杂度的查询）
- UNTREEIFY_THRESHOLD = 6;
- hash算法：(h = key.hashCode()) ^ (h >>> 16)

把32位的int值hash值的高16位和低16位做异或运算,是为了让hase值具备高16位与低16位的特征.减少hash冲突

- 寻址算法：n为容量 hashcode mod n, 对应的工程实现是 i=（n-1）& hashcode，效果相同，但位运算性能更高

为什么容量必须是2^n ？因为只有这样，(n-1) & hash 才能与 hash % n 等效。

- resize方法

***二叉树、二叉搜索树***

- 二叉搜索树(binary search tree)  的特点： 
-   1、左子树上所有节点的值都小于根的值
-    2、右子树上所有节点的值都大于根的值 
-    3、依次类推，左右子树也都是二叉搜索树 （这就是重复性）

查询和插入操作都是 O(logN)

- 二叉树的遍历 

  - 前序：根左右 
  - 中序：左根右 
  - 后序：左右根
    - 代码实现主要是使用递归思想（熟练到睡梦都能够写出来）：

  ```
  //前序遍历
  public List<Integer> preorderTraversal(TreeNode root) {
  		List<Integer> res = new ArrayList<Integer>();
  		preorder(root, res);
  		return res;
  }
  public void preorder(TreeNode root, List<Integer> res) {
  	if (root == null) {
  		return;
  	}
  	res.add(root.val);
  	preorder(root.left, res);
  	preorder(root.right, res);
  }
  
  // 同理可得中序遍历
  public List<Integer> inorderTraversal(TreeNode root) {
  	List<Integer> res = new ArrayList<Integer>();
  	inorder(root, res);
  	return res;
  }
  public void inorder(TreeNode root, List<Integer> res) {
  	if (root == null) {
  		return;
  	}
  	inorder(root.left, res);
  	res.add(root.val);
  	inorder(root.right, res);
  }
  
  // 同理可得后序遍历
  public List<Integer> postorderTraversal(TreeNode root) {
  	List<Integer> res = new ArrayList<Integer>();
  	postorder(root, res);
  	return res;
  }
  public void postorder(TreeNode root, List<Integer> res) {
  	if (root == null) {
  		return;
  	}
  	postorder(root.left, res);
  	postorder(root.right, res);
  	res.add(root.val);
  }
  ```

***本周总结***

1.本周第一部分的主要内容：哈希表、映射、集合的实现和特性。这些都是日常工作中用的最多的东西，必须要读懂jdk的工业级实现，了解底层的代码逻辑；

2.第二部分主要内容是树、二叉树和二叉搜索树的实现和特性。这一课程重在理解数据结构的特点，对于树的各种概念要清楚，还有一些工程的实现代码，掌握递归的思想精髓；

3.第三部分是堆、二叉堆和图的实现和特性，其中图不做重点考核，记住DFS和BFS即可。知道大顶堆以及Top K问题各种解法。