package com.zjq.javabase.base10.demo02;

/**
 * @author zjq
 */
public interface MyInterface {

    public default void method() {
        System.out.println("接口的默认方法");
    }

}
