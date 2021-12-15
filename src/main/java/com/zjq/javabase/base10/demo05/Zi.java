package com.zjq.javabase.base10.demo05;

/**
 * @author zjq
 */
public class Zi extends Fu {

    int num = 20;

    int age = 16;

    @Override
    public void showNum() {
        System.out.println(num);
    }

    @Override
    public void method() {
        System.out.println("子类方法");
    }

    public void methodZi() {
        System.out.println("子类特有方法");
    }
}
