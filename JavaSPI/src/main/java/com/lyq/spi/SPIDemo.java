package com.lyq.spi;

import com.lyq.service.PayMethod;
import com.lyq.service.impl.AliPayMethod;
import com.lyq.service.impl.WeChatPayMethod;
import sun.misc.Service;

import java.util.Iterator;
import java.util.ServiceLoader;

public class SPIDemo {
    public static void main(String[] args) {
        /**
         * 直接实例化耦合度较高
         */
        PayMethod aliPayMethod = new AliPayMethod();
        aliPayMethod.getPayMethod();
        PayMethod weChatPayMethod = new WeChatPayMethod();
        weChatPayMethod.getPayMethod();

        System.out.println("==========================");

        /**
         * 解耦灵活配置法
         */
        testSPI();
    }

    private static void testSPI() {
        //把我们的接口类型保存到ServiceLoader中 service变量
        //创建了lazyIterator对象 （把我们的接口保存     保存我们的classLoader）
        ServiceLoader<PayMethod> load = ServiceLoader.load(PayMethod.class);

        //或者Service.providers()方法获取我们的Iterator对象
        //Iterator<PayMethod> iterator  = Service.providers(PayMethod.class);

        Iterator<PayMethod> iterator = load.iterator();
        while(iterator.hasNext()){
            PayMethod next = iterator.next();
            next.getPayMethod();
        }

    }
}
