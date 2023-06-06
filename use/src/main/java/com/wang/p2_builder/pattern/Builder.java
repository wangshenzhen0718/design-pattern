package com.wang.p2_builder.pattern;

import com.wang.p2_builder.design.ceiling.LevelOneCeiling;
import com.wang.p2_builder.design.ceiling.LevelTwoCeiling;
import com.wang.p2_builder.design.coat.DuluxCoat;
import com.wang.p2_builder.design.coat.LiBangCoat;
import com.wang.p2_builder.design.floor.ShengXiangFloor;
import com.wang.p2_builder.design.tile.DongPengTile;
import com.wang.p2_builder.design.tile.MarcoPoloTile;

import java.math.BigDecimal;
/**
 * @Author:wsz
 * @Date: 2023/6/6 22:18
 * @Description:建造者模式：一些基本物料不会变，而其组合经常变化的时候，就可以选择这样的设计模式来构建代码。
 * 在建造者类内部处理构建过程
 * @Version: 1.0
 * @Since: 1.0
 */
public class Builder {

    public IMenu levelOne(BigDecimal area){
        return new DecorationPackageMenu(area,"欧式豪华")
                .appendCeiling(new LevelTwoCeiling())
                .appendCoat(new DuluxCoat())
                .appendFloor(new ShengXiangFloor());

    }

    public IMenu levelTwo(BigDecimal area){
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new MarcoPoloTile());       // 地砖，马可波罗
    }

    public IMenu levelThree(BigDecimal area){
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new DongPengTile());        // 地砖，东鹏
    }

}
