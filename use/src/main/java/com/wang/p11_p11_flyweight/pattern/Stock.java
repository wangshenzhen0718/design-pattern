package com.wang.p11_p11_flyweight.pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @Author:wsz
 * @Date: 2023/6/11 14:32
 * @Description: 变化的库存
 * @Version: 1.0
 * @Since: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stock {

    private int total; // 库存总量
    private int used;  // 库存已用
    
    // ...get/set
}