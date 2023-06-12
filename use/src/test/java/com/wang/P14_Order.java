package com.wang;

import com.wang.p14_order.pattern.XiaoEr;
import com.wang.p14_order.pattern.cook.GuangDongCook;
import com.wang.p14_order.pattern.cook.JiangSuCook;
import com.wang.p14_order.pattern.cook.ShanDongCook;
import com.wang.p14_order.pattern.cook.SiChuanCook;
import com.wang.p14_order.pattern.cuisine.*;
import org.junit.Test;

public class P14_Order {
  @Test
  public void test_order() {

    // 菜系 + 厨师；广东（粤菜）、江苏（苏菜）、山东（鲁菜）、四川（川菜）
    ICuisine guangDoneCuisine = new GuangDoneCuisine(new GuangDongCook());
    JiangSuCuisine jiangSuCuisine = new JiangSuCuisine(new JiangSuCook());
    ShanDongCuisine shanDongCuisine = new ShanDongCuisine(new ShanDongCook());
    SiChuanCuisine siChuanCuisine = new SiChuanCuisine(new SiChuanCook());

    // 点单
    XiaoEr xiaoEr = new XiaoEr();
    xiaoEr.order(guangDoneCuisine);
    xiaoEr.order(jiangSuCuisine);
    xiaoEr.order(shanDongCuisine);
    xiaoEr.order(siChuanCuisine);

    // 下单
    xiaoEr.placeOrder();
  }
}
