package com.zjq.javabase.base09.demo14;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 * 用户类
 * @author zjq
 */
public class User {
    /**
     * 姓名
     */
    private String name;
    /**
     * 余额，也就是当前用户拥有的钱数
     */
    private Integer money;

    public User() {
    }

    public User(String name, Integer money) {
        this.name = name;
        this.money = money;
    }

    // 展示一下当前用户有多少钱
    public void show() {
        System.out.println("我是" + name + "，我有多少钱：" + this.fenToYuan(String.valueOf(money))+"元");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    /**
     * 分转元
     * @param amount
     * @return
     */
    public   String fenToYuan(String amount){
        NumberFormat format = NumberFormat.getInstance();
        try{
            Number number = format.parse(amount);
            double temp = number.doubleValue() / 100.0;
            format.setGroupingUsed(false);
            format.setMaximumFractionDigits(2);
            amount = format.format(temp);
        } catch (ParseException e){
            e.printStackTrace();
        }
        return amount;
    }

    //验证红包汇总结果正确性
    public static void main(String[] args) {
        Double[] total = new Double[]{5.15, 3.2, 2.97, 1.51, 2.79, 5.09, 8.73, 4.87, 1.19, 2.3, 13.07, 1.04, 12.95, 18.94, 12.72, 3.48};
        Double t =0.0;
        for (Double aDouble : total) {
            t=t+aDouble;
        }
        System.out.println(t);
    }
}
