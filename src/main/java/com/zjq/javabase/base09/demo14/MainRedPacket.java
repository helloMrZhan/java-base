package com.zjq.javabase.base09.demo14;

import org.w3c.dom.Node;

import java.util.ArrayList;

/**
 * @author zjq
 */
public class MainRedPacket {

    public static void main(String[] args) throws Exception {
        Manager manager = new Manager("群主", 10000);
        Member member1 = new Member("张三", 1000);
        Member member2 = new Member("李四", 1000);
        Member member3 = new Member("王五", 1000);
        Member member4 = new Member("赵六", 1000);
        Member member5 = new Member("孙七", 1000);
        Member member6 = new Member("小詹", 1000);
        Member member7 = new Member("小明", 1000);
        Member member8 = new Member("小红", 1000);

        manager.show(); // 100
        member1.show(); // 10
        member2.show(); // 10
        member3.show(); // 10
        member4.show(); // 10
        member5.show(); // 10
        member6.show(); // 10
        member7.show(); // 10
        member8.show(); // 10
        System.out.println("============================");

        // 群主总共发20块钱，分成8个红包
        ArrayList<Integer> redList = manager.send(2000, 8, 0);
        // 八个普通成员收红包
        member1.receive(redList);
        member2.receive(redList);
        member3.receive(redList);
        member4.receive(redList);
        member5.receive(redList);
        member6.receive(redList);
        member7.receive(redList);
        member8.receive(redList);
    }


}
