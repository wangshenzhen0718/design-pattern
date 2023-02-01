package com.wang.factory.factorymethod.pizzastore.order;
import com.wang.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

public abstract Pizza createPizza(String orderType);
public OrderPizza(){
    Pizza pizza = null;
    String orderType;
    do{
        orderType=this.getType();
        pizza = createPizza(orderType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }while (true);

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
