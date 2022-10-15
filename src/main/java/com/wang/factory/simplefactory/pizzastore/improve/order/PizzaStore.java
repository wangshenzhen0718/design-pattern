package com.wang.factory.simplefactory.pizzastore.improve.order;

import java.io.IOException;

public class PizzaStore {
    public static void main(String[] args) throws IOException {
        new OrderPizza(new SimpleFactory());

    }
}
