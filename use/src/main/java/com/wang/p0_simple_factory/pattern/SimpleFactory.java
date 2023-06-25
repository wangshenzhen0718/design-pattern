package com.wang.p0_simple_factory.pattern;

public class SimpleFactory {
    Product createProduct(Integer type){
        if (type==1){
            return new ConcreateProduct1();
        }else if (type==2){
            return new ConcreateProduct2();
        }

        return new ConcreateProduct3();
    }
}
