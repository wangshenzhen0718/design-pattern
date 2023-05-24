package com.wang.seven_principles.p6_demeter.yes;

/**
 * @Author wsz
 * @Description
 * 1) 前面设计的问题在于SchoolManager中，CollegeEmployee类并不是 SchoolManager类的直接朋友 (分析)
 * 2) 按照迪米特法则，应该避免类中出现这样非直接朋友关系的耦合
 * @Date 2023/5/24
 */
public class Demeter {
    public static void main(String[] args) {
        //创建了一个 SchoolManager 对象
        SchoolManager schoolManager = new SchoolManager();
        //输出学院的员工id 和  学校总部的员工信息
        schoolManager.printAllEmployee(new CollegeManager());
    }
}