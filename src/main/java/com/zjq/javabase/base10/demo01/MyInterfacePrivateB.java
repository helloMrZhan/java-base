package com.zjq.javabase.base10.demo01;

/**
 * @author zjq
 */
public interface MyInterfacePrivateB {

    public static void methodStatic1() {
        System.out.println("静态方法1");
        //methodStaticCommon();
    }

    public static void methodStatic2() {
        System.out.println("静态方法2");
        //methodStaticCommon();
    }
//Java9开始支持private
//    private static void methodStaticCommon() {
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
//    }

}
