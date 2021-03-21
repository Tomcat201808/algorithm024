/**
 * 
 */
package com.geek.week07;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weifujun 非常经典的问题，括号生成问题，主要是DFS和剪枝法
 * @version Created in 2021年3月21日 下午12:13:35
 */
public class KuoHaoGen {
	// 将问题抽象成树形结构遍历问题
	public List<String> generat(int n) {
		List<String> res = new ArrayList<>();
		if (n <= 0)
			return res;
		dfs(n, "", res, 0, 0);// 一开始开括号和比括号都是零哈
		return res;
	}

	private void dfs(int n, String path, List<String> res, int open, int close) {
		if (open > n || close > open)
			return;
		if (path.length() == 2 * n) {
			res.add(path);
			return;
		}
		dfs(n, path + "(", res, open + 1, close);
		dfs(n, path + ")", res, open, close + 1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new KuoHaoGen().generat(1));
		System.out.println(new KuoHaoGen().generat(2));
		System.out.println(new KuoHaoGen().generat(3));
		System.out.println(new KuoHaoGen().generat(4));
		System.out.println(new KuoHaoGen().generat(5));
		// 超出了8就打印不出来了，哎难受啊
	}
}
