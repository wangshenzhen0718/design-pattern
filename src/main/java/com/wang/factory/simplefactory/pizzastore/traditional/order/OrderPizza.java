package com.wang.factory.simplefactory.pizzastore.traditional.order;

import com.wang.factory.simplefactory.pizzastore.traditional.pizza.CheesePizza;
import com.wang.factory.simplefactory.pizzastore.traditional.pizza.GreekPizza;
import com.wang.factory.simplefactory.pizzastore.traditional.pizza.PepperPizza;
import com.wang.factory.simplefactory.pizzastore.traditional.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    public OrderPizza() throws IOException {

        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            } else if (orderType.equals("pepper")) {
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        } while (true);
    }

    private String getType() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza type: ");
        String s = in.readLine();
        return s;
    }


}
