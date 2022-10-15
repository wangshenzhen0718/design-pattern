package com.wang.factory.absfactory.pizzastore.order;

import com.wang.factory.absfactory.pizzastore.pizza.*;

public class LDFactory implements AbsFactory{
    public Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if (orderType.equals("pepper")){
            pizza=new LDPepperPizza();
        }else if (orderType.equals("cheese")){
            pizza=new LDCheesePizza();
        }
        return pizza;
    }
}
