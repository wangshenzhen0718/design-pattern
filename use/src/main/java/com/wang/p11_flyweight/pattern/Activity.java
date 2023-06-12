package com.wang.p11_flyweight.pattern;

import lombok.Data;

import java.util.Date;
//不变的商品
@Data
public class Activity {

    private Long id;        // 活动ID
    private String name;    // 活动名称
    private String desc;    // 活动描述
    private Date startTime; // 开始时间
    private Date stopTime;  // 结束时间
    private Stock stock;    // 活动库存
    
    // ...get/set
}