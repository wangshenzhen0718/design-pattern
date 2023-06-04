package com.wang.p1_factory.design.coupon;

public class CouponService {
    public CouponResult sendCoupon(String uid,String couponNumber,String uuid){
        System.out.println("模拟发放优惠券一张："+uid+","+couponNumber+","+uuid);
        return new CouponResult("0000","发放成功");

    }
}
