package com.wang.p14_order.pattern.cuisine;

import com.wang.p14_order.pattern.cook.ICook;

public class JiangSuCuisine implements ICuisine {

    private ICook cook;

    public JiangSuCuisine(ICook cook) {
        this.cook = cook;
    }

    public void cook() {
        cook.doCooking();
    }

}