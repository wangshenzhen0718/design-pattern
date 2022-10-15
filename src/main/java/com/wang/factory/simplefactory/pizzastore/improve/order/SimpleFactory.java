package com.wang.factory.simplefactory.pizzastore.improve.order;

import com.wang.factory.simplefactory.pizzastore.improve.pizza.Pizza;
import com.wang.factory.simplefactory.pizzastore.improve.pizza.CheesePizza;
import com.wang.factory.simplefactory.pizzastore.improve.pizza.GreekPizza;
import com.wang.factory.simplefactory.pizzastore.improve.pizza.PepperPizza;

public class SimpleFactory {
    public Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }else {
            pizza=null;
        }
        return pizza;

    }
}
