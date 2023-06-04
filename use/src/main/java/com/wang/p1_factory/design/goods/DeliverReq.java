package com.wang.p1_factory.design.goods;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliverReq {
    private String userName;
    private String userPhone;
    private String sku;
    private String orderId;
    private String consigneeUserName;
    private String consigneeUserAddress;
    private String consigneeUserPhone;


}
