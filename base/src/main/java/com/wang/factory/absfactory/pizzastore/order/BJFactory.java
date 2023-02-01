package com.wang.factory.absfactory.pizzastore.order;

import com.wang.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.wang.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.wang.factory.absfactory.pizzastore.pizza.Pizza;

public class BJFactory implements AbsFactory{
    public Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if (orderType.equals("pepper")){
            pizza=new BJPepperPizza();
        }else if (orderType.equals("cheese")){
            pizza=new BJCheesePizza();
        }
        return pizza;
    }
}
