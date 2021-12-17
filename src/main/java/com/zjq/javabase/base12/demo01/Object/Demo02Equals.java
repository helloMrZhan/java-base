package com.zjq.javabase.base12.demo01.Object;

import java.util.ArrayList;

/**
 * * `public boolean equals(Object obj)`：指示其他某个对象是否与此对象“相等”。
 *
 * 调用成员方法equals并指定参数为另一个对象，则可以判断这两个对象是否是相同的。
 * 这里的“相同”有默认和自定义两种方式。
 *
 * ### 默认地址比较
 *
 * 如果没有覆盖重写equals方法，那么Object类中默认进行`==`运算符的对象地址比较，
 * 只要不是同一个对象，结果必然为false。
 *
 * ### 对象内容比较
 *
 * 如果希望进行对象的内容比较，即所有或指定的部分成员变量相同就判定两个对象相同，
 * 则可以覆盖重写equals方法。
 * @author zjq
 */
public class Demo02Equals {
    public static void main(String[] args) {
        /**
            Person类默认继承了Object类,所以可以使用Object类的equals方法
            boolean equals(Object obj) 指示其他某个对象是否与此对象“相等”。
            equals方法源码:
                public boolean equals(Object obj) {
                    return (this == obj);
                }
                参数:
                    Object obj:可以传递任意的对象
                    == 比较运算符,返回的是一个布尔值 true false
                    基本数据类型:比较的是值
                    引用数据类型:比价的是两个对象的地址值
               this是谁?那个对象调用的方法,方法中的this就是那个对象;p1调用的equals方法所以this就是p1
               obj是谁?传递过来的参数p2
               this==obj -->p1==p2
         */
        Person p1 = new Person("迪丽热巴",18);
        //Person p2 = new Person("古力娜扎",19);
        Person p2 = new Person("迪丽热巴",18);
        System.out.println("p1:"+p1);//p1:com.zjq.javabase.base12.demo01.Object.Person@58ceff1
        System.out.println("p2:"+p2);//p2:com.zjq.javabase.base12.demo01.Object.Person@7c30a502

        //p1=p2;//把p2的地址值赋值给p1
        ArrayList<String> list = new ArrayList<>();

        boolean b = p1.equals(p1);
        System.out.println(b);
    }
}
