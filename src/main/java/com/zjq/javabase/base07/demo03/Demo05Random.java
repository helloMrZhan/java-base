package com.zjq.javabase.base07.demo03;

import java.util.Random;
/**
 * @author zjq
 */
public class Demo05Random {

    public static void main(String[] args) { 
       Random r =new Random();
       System.out.println("生成boolean类型的随机数：" +r.nextBoolean());
       System.out.println("生成[0,1.0)区间的double类型的随机数：" +r.nextDouble());
       System.out.println("生成float类型的随机数：" +r.nextFloat());
       System.out.println("生成int类型的随机数：" +r.nextInt());
       System.out.println("生成0到10之间int类型的随机数：" +r.nextInt(10));
       System.out.println("生成long类型的随机数：" +r.nextLong());
       System.out.println("生成[0,5.0)区间的小数：" +r.nextDouble() * 5);
    }
}