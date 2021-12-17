package com.zjq.javabase.base12.demo01.Object;

import java.util.Objects;

/**
 * `java.lang.Object`类是Java语言中的根类，即所有类的父类。它中描述的所有方法子类都可以使用。在对象实例化的时候，最终找的父类就是Object。
 *
 * 如果一个类没有特别指定父类，	那么默认则继承自Object类。例如：
 *
*
*根据JDK源代码及Object类的API文档，Object类当中包含的方法有11个。今天我们主要学习其中的2个：
*
** `public String toString()`：返回该对象的字符串表示。
** `public boolean equals(Object obj)`：指示其他某个对象是否与此对象“相等”。
 *
 * 在**JDK7**添加了一个Objects工具类，它提供了一些方法来操作对象，它由一些静态的实用
 * 方法组成，这些方法是null-save（空指针安全的）或null-tolerant（容忍空指针的），用于
 * 计算对象的hashcode、返回对象的字符串表示形式、比较两个对象。
 *
 * 在比较两个对象的时候，Object的equals方法容易抛出空指针异常，而Objects类中的equals方
 * 法就优化了这个问题。方法如下：
 *
 * * `public static boolean equals(Object a, Object b)`:判断两个对象是否相等。
* @author zjq
 */
public class Demo03Objects {
    public static void main(String[] args) {
        String s1 = "abc";
        //String s1 = null;
        String s2 = "abc";
        //boolean b = s1.equals(s2); // NullPointerException null是不能调用方法的,会抛出空指针异常
        //System.out.println(b);
        /**
            Objects类的equals方法:对两个对象进行比较,防止空指针异常
            public static boolean equals(Object a, Object b) {
                return (a == b) || (a != null && a.equals(b));
            }
         */
        boolean b2 = Objects.equals(s1, s2);
        System.out.println(b2);

    }
}
