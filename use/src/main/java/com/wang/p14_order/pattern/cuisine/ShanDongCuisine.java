package com.wang.p14_order.pattern.cuisine;

import com.wang.p14_order.pattern.cook.ICook;

public class ShanDongCuisine implements ICuisine {

    private ICook cook;

    public ShanDongCuisine(ICook cook) {
        this.cook = cook;
    }

    public void cook() {
        cook.doCooking();
    }

}
 