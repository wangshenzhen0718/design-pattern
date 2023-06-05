package com.wang;

import com.wang.p2_abstract_factory.pattern.ICacheAdapter;
import com.wang.p2_abstract_factory.pattern.ProxyUtil;
import com.wang.p2_abstract_factory.pattern.impl.EGMCacheAdapter;
import com.wang.p2_abstract_factory.pattern.impl.IIRCacheAdapter;
import org.junit.Test;

public class P2_Abstract_Factory {
  @Test
  public void testP2() {

    ICacheAdapter egmCacheAdapter = (ICacheAdapter) ProxyUtil.getProxy(new EGMCacheAdapter());
    egmCacheAdapter.set("name", "wsz");
    System.out.println("测试结果："+egmCacheAdapter.get("name"));

    ICacheAdapter iirCacheAdapter = (ICacheAdapter) ProxyUtil.getProxy(new IIRCacheAdapter());
    iirCacheAdapter.set("name", "hrm");
    System.out.println("测试结果："+iirCacheAdapter.get("name"));
  }
}
