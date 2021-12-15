package com.zjq.javabase.base10.demo03;

/**
 * @author zjq
 */
public interface MyInterfaceA {

    public abstract void methodA();

    public abstract void methodCommon();

    public default void methodDefault() {
        System.out.println("AAA");
    }

}
