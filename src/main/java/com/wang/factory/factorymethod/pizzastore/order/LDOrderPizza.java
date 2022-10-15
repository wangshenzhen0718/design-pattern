package com.wang.factory.factorymethod.pizzastore.order;

import com.wang.factory.factorymethod.pizzastore.pizza.*;

public class LDOrderPizza extends OrderPizza{
    Pizza pizza=null;

    public Pizza createPizza(String orderType) {
        if (orderType.equals("cheese")){
            pizza=new LDCheesePizza();
            pizza.setName(orderType);

        }else if (orderType.equals("pepper")){
            pizza=new LDPepperPizza();
            pizza.setName(orderType);
        }
        return pizza;
    }
}
