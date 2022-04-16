package com.zjq.javabase.base09.demo14;

import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;

/**
 * 群主的类
 * @author zjq
 */
public class Manager extends User {

    /**
     * 收到单个红包最大值
     */
    private static final int MAX_AMOUNT = 20000;

    public Manager() {
    }

    public Manager(String name, int money) {
        // 通过super 调用父类构造方法
        super(name, money);
    }


    /**
     * 发红包
     * @param totalMoney 红包总金额（单位分）
     * @param count 发包个数
     * @param type 发包类型（0、随机红包，1、定额红包）
     * @return 红包集合
     * @throws Exception
     */
    public ArrayList<Integer> send(Integer totalMoney, int count,int type) throws Exception {
        // 首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>(count);

        // 首先看一下群主自己有多少钱
        Integer leftMoney = super.getMoney(); // 群主当前余额
        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return redList; // 返回空集合
        }

        // 扣钱，其实就是重新设置余额
        super.setMoney(leftMoney - totalMoney);


        if (count == 1) {
            redList.add(totalMoney);
            return redList;
        }

        switch (type) {
            case 0:
                // 默认分配1分至每一位
                for (int i = 0; i < count; i++) {
                    redList.add(1);
                }
                int surplus_currency = totalMoney - redList.size(),// 剩余金额数
                        surplus_number = redList.size();// 剩余需追加的数量

                for (int i = 0; i < redList.size(); i++) {

                    // 没值可以追加了
                    if (new Integer(0).equals(surplus_currency)) {
                        break;
                    }

                    // (总数-（总包-i）*最小值) / (总包 - i) 随机安全值算法
                    int safe_total = (int)Math.floor((totalMoney - (count - i)) / (count - i));
                    if (new Integer(0).equals(safe_total)) {// 随机值不能为0
                        safe_total = 1;
                    }
                    // 该次随机值
                    int randomint = surplus_currency >= safe_total - 1 ? safe_total : surplus_currency + 1;
                    // 下次可能最大能剩余值
                    int nextMax_currency = (MAX_AMOUNT - 1) * (surplus_number - 1);
                    // 最小的随机数     剩余金额-剩余最大随机的总数（不含这一次）
                    int minRandom = surplus_currency -  nextMax_currency;
                    if (minRandom < 0) {
                        minRandom = 0;
                    }

                    // 规避一些特殊情况,每个接近2000或1时会发生
                    boolean must = (surplus_currency - count * MAX_AMOUNT <= 2 && surplus_currency - count * MAX_AMOUNT >= 0)
                            /*|| surplus_currency < packet_number * 2*/;
                    // 控制安全随机值           随机安全值不能大于最大限制，并且不能小于最小限 制
                    if (safe_total < minRandom || safe_total > MAX_AMOUNT || must) {
                        safe_total = MAX_AMOUNT;
                        // 该次随机值
                        randomint = surplus_currency >= safe_total - 1 ? safe_total : surplus_currency + 1;
                        // 下次可能最大能剩余值
                        nextMax_currency = (randomint - 1) * (surplus_number - 1);
                        // 最小的随机数     剩余金额-剩余最大随机的总数（不含这一次）
                        minRandom = surplus_currency -  nextMax_currency;
                        if (minRandom < 0) {
                            minRandom = 0;
                        }
                    }

                    // 下一次最大的随机值
                    int nextMaxRandomInt = nextMax_currency - (surplus_currency - (randomint - 1));
                    Integer maxRandom = nextMaxRandomInt <= 0 ? nextMaxRandomInt + randomint: null;
                    // 能随机          剩余的金额  - 最大随机数 >  最大随机数  * 剩余数量
                    boolean canRandom = surplus_currency - (randomint - 1) > nextMax_currency ||
                            nextMaxRandomInt > (randomint - 1)
                            || !new Integer(0).equals(minRandom);

                    int addNumber; // 追加的金额
                    if (canRandom && !new Integer(randomint).equals(minRandom+1) && !(new Integer(randomint).equals(minRandom) && new Integer(safe_total).equals(minRandom)) ) {
                        addNumber = myRandom(minRandom, maxRandom == null ? randomint : maxRandom- 1);
                    }else {
                        addNumber = randomint - 1;
                    }
                    redList.set(i,redList.get(i) + addNumber);
                    surplus_currency -= addNumber;
                    surplus_number--;
                }
                break;
            case 1:
                // 定额红包校验
                redList = new ArrayList<>(count);
                for (int i = 0; i <count; i++) {
                    //定额红包要是不能整除会有问题，正常实现应该是输入单个红包金额和总数直接就能计算
                    redList.add(totalMoney/count);
                }
                break;
            default:
                throw new Exception("类型错误！");
        }

        System.out.println("我是" + this.getName() + "我发了"+fenToYuan(String.valueOf(totalMoney))+"元红包"+"，我现在有多少钱：" + fenToYuan(String.valueOf(this.getMoney()))+"元");
        return redList;
    }

    /**
     * 生成随机金额
     * @param min
     * @param randomint
     * @return
     */
    public static int myRandom(int min,int randomint) {
        if (min == 0) {
            return  RandomUtils.nextInt(0,randomint);
        }else {
            int nextInt = RandomUtils.nextInt(min,randomint - min);
            return nextInt + min;
        }
    }
}
