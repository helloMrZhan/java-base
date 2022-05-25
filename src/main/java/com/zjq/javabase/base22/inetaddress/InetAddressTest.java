package com.zjq.javabase.base22.inetaddress;

import org.junit.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * InetAddress测试案例
 * @author zjq
 * @date 2022/5/25
 */
public class InetAddressTest {

    @Test
    public void inetAddressTest() throws IOException {
        // 根据域名来获取对应的InerAddress实例
        InetAddress ip = InetAddress.getByName("www.baidu.com");
        // 判断是否可达
        System.out.println("百度是否可达：" + ip.isReachable(2000));
        // 获取该InetAddress实例的IP字符串
        System.out.println(ip.getHostAddress());
        //获取主机名（域名）
        System.out.println(ip.getHostName());
        //获取原始 IP 地址
        System.out.println(ip.getAddress());
        // 获取该InetAddress实例对应的全限定域名
        //System.out.println(ip.getCanonicalHostName());
        // 根据原始IP地址来获取对应的InetAddress实例
        InetAddress local = InetAddress.getByAddress(new byte[] { 127, 0, 0, 1 });
        System.out.println("本机是否可达：" + local.isReachable(1000));
    }
}
