package com.zjq.javabase.base24.demo06.StaticMethodReference;

/**
 * @author zjq
 */
@FunctionalInterface
public interface Calcable {
    //定义一个抽象方法,传递一个整数,对整数进行绝对值计算并返回
    int calsAbs(int number);
}
