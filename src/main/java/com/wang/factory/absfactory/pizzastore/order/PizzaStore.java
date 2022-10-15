package com.wang.factory.absfactory.pizzastore.order;

import java.io.IOException;
import java.util.Calendar;

public class PizzaStore {
    public static void main(String[] args) throws IOException {

        //new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());

    }
}
