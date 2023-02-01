package com.wang.factory.simplefactory.pizzastore.improve.order;

import com.wang.factory.simplefactory.pizzastore.improve.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    SimpleFactory simpleFactory;
    Pizza pizza = null;
    public OrderPizza(SimpleFactory factory) {
        setSimpleFactory(factory);
    }

    public void setSimpleFactory(SimpleFactory factory) {
        this.simpleFactory = factory;
        String orderType = "";
        do {
            orderType = this.getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败！！！");
                break;
            }
        } while (true);
    }

    private String getType() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza type: ");
        String s = null;
        try {
            s = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }


}
