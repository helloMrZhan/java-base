package com.zjq.javabase.base07.demo03;

import java.util.Random;

/**
 * @author zjq
 */
public class Demo02Random {

    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10); // 范围实际上是0~9
            System.out.println(num);
        }
    }

}
