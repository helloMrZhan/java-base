package com.zjq.javabase.base08.demo03;


/**
 * @author zjq
 */
public class Person {

    static {
        System.out.println("静态代码块执行！");
    }

    public Person() {
        System.out.println("构造方法执行！");
    }

}
