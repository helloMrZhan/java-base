package com.zjq.javabase.base24.demo04.MethodReference;
/**
    定义一个打印的函数式接口
 * @author zjq
 */
@FunctionalInterface
public interface Printable {
    //定义字符串的抽象方法
    void print(String s);
}
