package com.zjq.javabase.base22.URLDecoderURLEncoder;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * URLDecoder和URLEncoder
 * @author zjq
 * @date 2022/5/25
 */
public class URLDecoderURLEncoderTest {

    @Test
    public  void URLDecoderURLEncoderTest() throws UnsupportedEncodingException {
        //将application/x-www-form-urlencoded字符串转换成普通字符串
        String decode = URLDecoder.decode("https://blog.csdn.net/qq_35427589/article/details/122321132?ops_request_misc=&request_id=&biz_id=102&utm_term=%E5%85%B1%E9%A5%AE%E4%B8%80%E6%9D%AF%E6%97%A0", "UTF-8");
        System.out.println("urlDecode:"+decode);
        //将普通字符串转换成application/x-www-form-urlencoded字符串
        String encode = URLEncoder.encode("共饮一杯无" , "UTF-8");
        System.out.println("urlEncode:"+encode);
    }
}
