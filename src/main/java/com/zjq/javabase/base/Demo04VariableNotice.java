package com.zjq.javabase.base;

/**
 *使用变量的时候，有一些注意事项：
 *
 * 1. 如果创建多个变量，那么变量之间的名称不可以重复。
 * 2. 对于float和long类型来说，字母后缀F和L不要丢掉。
 * 3. 如果使用byte或者short类型的变量，那么右侧的数据值不能超过左侧类型的范围。
 * 4. 没有进行赋值的变量，不能直接使用；一定要赋值之后，才能使用。
 * 5. 变量使用不能超过作用域的范围。
 * 【作用域】：从定义变量的一行开始，一直到直接所属的大括号结束为止。
 * 6. 可以通过一个语句来创建多个变量，但是一般情况不推荐这么写。
*/
public class Demo04VariableNotice {
	public static void main(String[] args) {
		int num1 = 10; // 创建了一个新的变量，名叫num1
		// int num1 = 20; // 又创建了另一个新的变量，名字也叫num1，错误！
		
		int num2 = 20;
		
		int num3;
		num3 = 30;
		
		int num4; // 定义了一个变量，但是没有进行赋值
		// System.out.println(num4); // 直接使用打印输出就是错误的！
		
		// System.out.println(num5); // 在创建变量之前，不能使用这个变量
		
		int num5 = 500;
		System.out.println(num5); // 500
		
		{
			int num6 = 60;
			System.out.println(num6); // 60
		}
		// int num6;
		// System.out.println(num6); // 已经超出了大括号的范围，超出了作用域，变量不能再使用了
		
		// 同时创建了三个全都是int类型的变量
		int a, b, c;
		// 各自分别赋值
		a = 10;
		b = 20;
		c = 30;
		System.out.println(a); // 10
		System.out.println(b); // 20
		System.out.println(c); // 30
		
		// 同时创建三个int变量，并且同时各自赋值
		int x = 100, y = 200, z = 300;
		System.out.println(x); // 100
		System.out.println(y); // 200
		System.out.println(z); // 300
	}
}