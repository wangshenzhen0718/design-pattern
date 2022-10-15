package com.wang.factory.absfactory.pizzastore.order;

import com.wang.factory.absfactory.pizzastore.pizza.Pizza;

public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
