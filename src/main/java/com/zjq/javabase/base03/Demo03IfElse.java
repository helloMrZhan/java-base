package com.zjq.javabase.base03;

/**
 * 标准的if-else语句
 * @author zjq
 */
public class Demo03IfElse {
	public static void main(String[] args) {
		int num = 666;
		// 如果除以2能够余数为0，说明是偶数
		if (num % 2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}
	}
}