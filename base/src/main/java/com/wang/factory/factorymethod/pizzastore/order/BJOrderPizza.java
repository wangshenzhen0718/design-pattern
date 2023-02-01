package com.wang.factory.factorymethod.pizzastore.order;

import com.wang.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.wang.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.wang.factory.factorymethod.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{
    Pizza pizza=null;

    public Pizza createPizza(String orderType) {
        if (orderType.equals("cheese")){
            pizza=new BJCheesePizza();
            pizza.setName(orderType);

        }else if (orderType.equals("pepper")){
            pizza=new BJPepperPizza();
            pizza.setName(orderType);
        }
        return pizza;
    }
}
