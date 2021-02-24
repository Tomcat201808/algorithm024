学习笔记

本周主要学习的内容是递归，分治和回溯，个人感觉，还是很难的。

首先是对于理解上，如果说是找到重复性，找到递归，最小重复单元，然后写代码，按照if else  for loop来做，简单的还行，一旦复杂性上来，还是不会做。

以柠檬水找零为例，这个贪心算法，真的想不到会那么简洁，太惊叹了，居然可以写得如此完美而优雅，我只有默默背诵下来了，然后使用五毒神掌来复习和过遍数了；

还有我比较喜欢二分查找，个人感觉这个比较简单，对于模板和样式，我都是自己能够顺手拈来的感觉：

``public static int binarySearch(int array[], int target) {`
		`int left = 0, mid, right = array.length - 1;`
		`while (left <= right) { // 这个等于号，差点害死人`
			`mid = (right - left) / 2 + left; // 这个处理，给满分！`
			`// 如果查找的数据和中间的数据相等，则返回`
			`if (array[mid] == target)`
				`return mid;`
			`// 如果查找的数据在右半边，则左边指针是中位加一`
			`else if (array[mid] < target) {`
				`left = mid + 1;`
				`// 否则，就是查找的目标数据在左边，则右指针是中位减一`
			`} else {`
				`right = mid - 1;`
			`}`
		`}`
		`return -1;`
	}`

