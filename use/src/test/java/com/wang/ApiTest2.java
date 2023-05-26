package com.wang;


import com.wang.p1_factory.factory_method.method.service.ICacheAdapter;
import com.wang.p1_factory.factory_method.method.ProxyUtil;
import com.wang.p1_factory.factory_method.method.service.impl.EGMCacheAdapter;
import com.wang.p1_factory.factory_method.method.service.impl.IIRCacheAdapter;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest2 {
    private Logger logger = LoggerFactory.getLogger(ApiTest2.class);

    /*调用不同集群工作*/
    @Test
    public void test_CacheService2() throws Exception {

        ICacheAdapter proxy_EGM = (ICacheAdapter) ProxyUtil.newProxyInstance(new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "wsz");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("测试结果：" + val01);

        ICacheAdapter proxy_IIR = (ICacheAdapter) ProxyUtil.newProxyInstance(new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "zsw");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);

    }
}
