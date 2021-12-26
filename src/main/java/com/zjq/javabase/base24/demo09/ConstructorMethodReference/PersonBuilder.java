package com.zjq.javabase.base24.demo09.ConstructorMethodReference;
/**
    定义一个创建Person对象的函数式接口
 * @author zjq
 */
@FunctionalInterface
public interface PersonBuilder {
    //定义一个方法,根据传递的姓名,创建Person对象返回
    Person builderPerson(String name);
}