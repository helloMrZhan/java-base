package com.zjq.javabase.base09.demo14;

import java.util.ArrayList;
import java.util.Random;

/**
 * 普通成员
 * @author zjq
 */
public class Member extends User {

    public Member() {
    }

    public Member(String name, Integer money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        // 从多个红包当中随便抽取一个，给我自己。
        // 随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());
        // 根据索引，从集合当中删除，并且得到被删除的红包，给我自己
        Integer delta = list.remove(index);
        // 当前成员自己本来有多少钱：
        Integer money = super.getMoney();
        // 加法，并且重新设置回去
        super.setMoney(money + delta);
        System.out.println("我是" + this.getName() + "，我抢到了"+fenToYuan(String.valueOf(delta))+"元红包"+"，我现在有多少钱：" + fenToYuan(String.valueOf(this.getMoney()))+"元");
    }
}
