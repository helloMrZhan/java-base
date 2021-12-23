package com.zjq.javabase.base18.demo03.Lambda;
/**
    创建Runnable接口的实现类,重写run方法,设置线程任务
 * @author zjq
 */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" 新线程创建了");
    }
}
