package com.wang.p2_builder.design;


import com.wang.p2_builder.old.ceiling.LevelOneCeiling;
import com.wang.p2_builder.old.ceiling.LevelTwoCeiling;
import com.wang.p2_builder.old.coat.DuluxCoat;
import com.wang.p2_builder.old.coat.LiBangCoat;
import com.wang.p2_builder.old.floor.ShengXiangFloor;
import com.wang.p2_builder.old.tile.DongPengTile;
import com.wang.p2_builder.old.tile.MarcoPoloTile;

/**
 * @Author wsz
 * @Description 当：一些基本物料不会变，而其组合经常变化的时候，就可以选择这样的设计模式来构建代码。
 * @Date 2023/5/28
 */
public class Builder {

    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling())    // 吊顶，二级顶
                .appendCoat(new DuluxCoat())             // 涂料，多乐士
                .appendFloor(new ShengXiangFloor());     // 地板，圣象
    }

    public IMenu levelTwo(Double area) {
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new MarcoPoloTile());       // 地砖，马可波罗
    }

    public IMenu levelThree(Double area) {
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new DongPengTile());        // 地砖，东鹏
    }

}
