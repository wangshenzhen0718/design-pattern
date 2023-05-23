package com.wang.seven_principles.p3_inversion.improve.second;

/**
 * @Author wsz
 * @Description 依赖关系传递的三种方式和应用案例
 * 1) 接口传递
 * 2) 构造方法传递
 * 3) setter方式传递
 * 应用案例代码
 * @Date 2023/5/23
 */
public class DependencyPass {
    //构造方法传递依赖关系
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose(changHong);
        openAndClose.open();

    }
}
