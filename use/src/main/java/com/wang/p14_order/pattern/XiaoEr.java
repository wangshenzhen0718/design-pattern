package com.wang.p14_order.pattern;

import com.wang.p14_order.pattern.cuisine.ICuisine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
/**
 * @Author:wsz
 * @Date: 2023/6/12 21:46
 * @Description:命令模式：主要有命令（菜品），实现（厨师），调用者（小二），实现者构造进命令内部
 * @Version: 1.0
 * @Since: 1.0
 */
public class XiaoEr {

    private Logger logger = LoggerFactory.getLogger(XiaoEr.class);

    private List<ICuisine> cuisineList = new ArrayList<ICuisine>();

    public void order(ICuisine cuisine) {
        cuisineList.add(cuisine);
    }

    public synchronized void placeOrder() {
        for (ICuisine cuisine : cuisineList) {
            cuisine.cook();
        }
        cuisineList.clear();
    }

}