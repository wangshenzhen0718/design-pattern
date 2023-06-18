package com.wang.p22_visitor.visitor;


import com.wang.p22_visitor.user.impl.Student;
import com.wang.p22_visitor.user.impl.Teacher;

public interface Visitor {

    // 访问学生信息
    void visit(Student student);

    // 访问老师信息
    void visit(Teacher teacher);

}
