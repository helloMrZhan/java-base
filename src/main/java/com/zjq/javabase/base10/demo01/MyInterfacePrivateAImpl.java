package com.zjq.javabase.base10.demo01;

/**
 * @author zjq
 */
public class MyInterfacePrivateAImpl implements MyInterfacePrivateA {

    public void methodAnother() {
        // 直接访问到了接口中的默认方法，这样是错误的！
//        methodCommon();
    }

}
