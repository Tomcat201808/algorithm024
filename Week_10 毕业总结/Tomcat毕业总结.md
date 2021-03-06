Tomcat毕业总结



这十周，我个人的感觉是在不舒适的情况下，逼着自己完成一道有一道题目的。对于已经毕业了将近9年的我，确实感觉到了掌握数据结构和算法的难度，所以在不断实践五毒神掌的同时，摈弃了过去的死磕一道题的方式，不断地逼迫自己去理解，去写代码，哪怕是对着敲，也要敲到自己能够理解，能够自己写出来了为止，然后在理解的基础上，再使用五毒神掌来过遍数。比如学习KMP算法的时候，确实非常懵逼，甚至都不知道说些什么，然后我先吧暴力算法自己写了出来，不断地去理解k=next[k],然后代入字符串来模拟，这才有了一点点的感觉。还有就是快排，自己就是没法写出最优雅的代码，就会去按照他人的逻辑，自己充分理解的基础上写了出来，方能够真正理解分区partition函数。

回头认真总结，这十周的训练，获益匪浅。

#### **数据结构：**

###### 数组

这是一种内存连续的线性表结构，每个存储单元占用的内存空间大小固定，且知道首地址，因此可以很快的用 首地址+空间大小 计算出任意元素的内存地址，**查找的时间复杂度为O(1)**,**但是插入和删除的平均时间复杂度为O(n)**，因为会涉及数据迁移，实际运用的时候需要注意，在进行大块内存申请的时候可能会失败，即使当前空间足够，因为数组需要的是连续空间，而现在内存里面大部分可能是分散的空间，所以这种时候比较推荐使用链表，对空间利用率会高点。

###### 链表

是一种线性的存储结构，里面存储单元以节点的形式存在，节点里会包含指针(指向下一个节点，当指针指向null则代表到了尾部)和存储的数据。

**链表查找是O(n)，因为需要用指针从头开始遍历，插入删除则是O(1)**。在实际中会做很多优化，如双向链表，以及和map一起使用等。链表相比数组是每个节点的内存空间随机，且数据非顺序，这样存储会十分灵活。

###### 栈

先入后出的数据结构，一般用来做括号匹配，以及面积判断，接雨水等问题求救。

###### 队列

队列是一种先入先出的数据结构，在实际业务场景中运用的还是比较多的，如消息中间件等，队列里有一个特殊存在，双端队列，可以两头操作，基本一个数据结构就囊括了栈和队列所有特性。

###### hashMap

**哈希表**是一种在数组上扩展出来的数据结构，它实际还是用数组存储的数据，只是做了一定封装。哈希表一个特点是可以根据输入O(1)复杂度找到对应的数据，其实就是利用数组查询是O(1)的特性以及hash函数对输入数据进行转换为数组下标index的过程。

**哈希函数**的设计其实很讲究，一个好的哈希函数这几能有效避免哈希冲突，且运算速度很快，但是实际很难得到两者平衡，大多数都是根据实际场景实际分析，可能就是工程中的妥协吧。

**哈希冲突**指的是当数据量大到一定程度，会导致两个不同的数据通过哈希函数计算被映射到了同一个index下，这时候你的查询就不是O(1)了，就可能是O(m)（m代表同一地址存了多少个元素），或者是O(logm)。工业上的解决办法通常有两种，链表法和红黑树。

当元素个数<=8时，用链表，当元素个数>8时，则用红黑树。

###### Set

set是一种无序且不重复的数据结构，长用于去重和缩小数据量的操作，java里面的实现比较有意思，就是直接用map的key当做Set的value，然后map的value直接用一个固定值站位，因为不会用到它。

###### 跳表

跳表(Skip-list)只能用于元素有序的情况，你可以想象成链表的升级版，它在链表上加了索引，从而提升了查询速度，在现在的开源项目中一般都用跳表代替红黑树，易实现好维护。

###### 树

树是一种十分常用的数据结构，其实当一个链表的节点由一个变成两个或多个就变成树，树的实现有很多，二叉搜索树，avl树，红黑树，B+树等。

因为二叉树分为左右两个子树，且左右子树和二叉树特性相同，因此常常用递归去实现树的操作。

###### 二叉搜索树

空树也是二叉搜索树，二叉搜索树的左儿子小于根节点，且根节点小于右儿子，左右子树同理可得。

二叉搜索树在查找的时候时间复杂度为O(logn)，它的插入和查找类似，先进行查找，如果查找的位置没有节点，则在那个位置插入。

删除的话会麻烦点，当删除的节点是叶子节点，直接删除就行，当删除的节点是父亲节点，就需要将该父亲节点右子树里面最小的节点放到该父亲节点。

###### 堆

堆常用来求topk的问题，堆分为大顶堆和小顶堆，以大顶堆为例，堆里元素子节点都小于父亲节点，左右子树同理可得。

堆的构建时间复杂度是O（logn）

堆的查找也是O(logn)

堆的删除会比较麻烦，它会将堆顶元素取走，然后将堆尾的元素放到堆顶，然后重新构建整个堆。时间复杂度也是O(logn)

###### avl树

严格的平衡二叉树，需要记住四种旋转平衡，但是就是由于太严格了，有了很多不必要的操作，所以后面相处了红黑树。

###### 红黑树

红黑树是一个近似平衡的二叉树，它不需要频繁的去触发平衡操作，这样会省去很多不必要的操作。它能确保任何一个几点左右子树的高度差小于两倍。

#### **算法和思维**：

##### 递归，回溯，分治

严格的来说回溯和分治是算法思维，但其依赖的本质还是递归，递归是计算机的一种常用方法，特别是对于复杂逻辑，当你在找到这些复杂逻辑的重复性之后，然后将其抽象为函数，在不断调用这个函数的过程，就是递归。

递归的一个很重要特点就是找重复性，找到重复性之后，计算机能很好的去完成不断重复的东西，且特别高效。

递归模板：这个需要在O(1)时间反应出来

```
public void recur(level,max,....){
//终止条件
if（max>level）
return;

//当前层逻辑

//进入下一层
recur(level+1,max,....)

//重置状态，一般用户对多种状态进行尝试，回溯等
}
```

回溯就是不断的尝试每种可能，直到找到正确的结果为止，回溯一般时间复杂度很高，是指数级的，因此需要搭配剪枝一起使用从而控制时间复杂度。

分治是采用分而治之的思想，将一个大问题拆成几个小问题，然后分别将小问题求解之后，在组装其结果，最后得出最终结果。计算机天生适合处理分治递归等问题，因为它们能并行。

###### DFS，BFS,双向BFS，启发式搜索(A*)

上面这些都是搜索算法，在一个图或者树中对目标结果进行搜索，根据方式不同分为

深度优先搜索是指将每条路径直接走到底，当该条路径遍历完都没有找到目标结果时，在换另一条，直到找到。有种不撞南墙不回头的意思。

广度优先搜索是指按照波纹扩散的方式将对每条路的下一层节点进行遍历，直到找到目标节点。我感觉实际中推荐用BFS，因为DFS当数据量太大时很可能带来较高的时间复杂度。

双向BFS指的是在BFS的基础上进行优化，常规BFS是从起点到终点扩散，而双向BFS是从起点和终点同时向中间扩散，且每次优先用节点少的那端扩散，当起点和终点直接深度很深的时候，双向BFS能比常规BFS快很多。

启发式搜索(A*)，这个定义就比较灵活了，你可以自己制定比较规则，然后按照你制定的比较规则进行遍历。

###### 贪心算法

- 递归，回溯，分治，
- BFS, DFS,双向BFS,启发式搜索(A*)
- 贪心算法
- 二分查找
- 排序
- 动态规划
- 位运算
- 布隆过滤器
- LRU Cache
- 字典树和并查集
- 字符串比较算法

****

结合王争老师的《**数据结构与算法之美**》，掌握了基本的数据结构和具体实现的算法，了解使用场景和实现了，在了解其实现后在实际开发中确实会用的更加得心应手了。但有的还是不够熟练，需要过遍数，如Tire，位运算，字符串匹配算法KMP/ **BFPRT** 算法等，现在基本还是没有理解的状态，需要多过遍数才能领悟。比较幸运的是，对于二分查找、**递归**和**动态规划**还是有自己的理解，其核心思想都大概掌握了，接下来就是针对该专题做地毯式地归纳和总结，写代码了。

**最后感谢算法训练营所有覃超老师、助教们和班班的付出！**