package com.zjq.javabase.base09.demo11;

/**
 * @author zjq
 */
public class DemoMain {

    public static void main(String[] args) {
//        Animal animal = new Animal(); // 错误写法！不能直接创建抽象类对象

        Cat cat = new Cat();
        cat.eat();
    }

}
