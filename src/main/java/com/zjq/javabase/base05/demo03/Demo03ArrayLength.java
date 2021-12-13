package com.zjq.javabase.base05.demo03;

/**
 * 所有的引用类型变量，都可以赋值为一个null值。但是代表其中什么都没有。
 *
 * 数组必须进行new初始化才能使用其中的元素。
 * 如果只是赋值了一个null，没有进行new创建，
 * 那么将会发生：
 * 空指针异常 NullPointerException
 *
 * 原因：忘了new
 * 解决：补上new
 * @author zhanjq
 */
public class Demo03ArrayLength {

    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {10, 20, 30, 3, 5, 4, 6, 7, 8, 8, 65, 4, 44, 6, 10, 3, 5, 4, 6, 7, 8, 8, 65, 4};
        int len = arrayB.length;
        System.out.println("arrayB数组的长度是：" + len);
        System.out.println("=============");

        int[] arrayC = new int[3];
        System.out.println(arrayC.length); // 3
        arrayC = new int[5];
        System.out.println(arrayC.length); // 5
    }

}
