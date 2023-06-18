package com.wang.p22_visitor.user.impl;


import com.wang.p22_visitor.user.User;
import com.wang.p22_visitor.visitor.Visitor;

// 学生
public class Student extends User {

    public Student(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int ranking() {
        return (int) (Math.random() * 100);
    }

}
