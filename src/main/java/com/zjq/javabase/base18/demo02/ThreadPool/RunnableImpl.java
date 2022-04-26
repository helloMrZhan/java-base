package com.zjq.javabase.base18.demo02.ThreadPool;
/**
    2.创建一个类,实现Runnable接口,重写run方法,设置线程任务
 * @author zjq
 */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + "创建了一个新的线程开始执行");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + "创建了一个新的线程执行结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
