package com.zjq.javabase.base17.demo02.setName;

/**
 * @author zjq
 */
public class Demo01SetThreadName {
    public static void main(String[] args) {
        //开启多线程
        MyThread mt = new MyThread();
        mt.setName("小强");
        mt.start();

        //开启多线程
        new MyThread("旺财").start();
    }
}
