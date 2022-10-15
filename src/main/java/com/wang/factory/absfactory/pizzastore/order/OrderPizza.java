package com.wang.factory.absfactory.pizzastore.order;

import com.wang.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public  class OrderPizza {
    AbsFactory factory;

    public void setFactory(AbsFactory factory) {
        this.factory = factory;
        Pizza pizza = null;
        String orderType;
        do{
            orderType=this.getType();
            pizza = factory.createPizza(orderType);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
            else
            {
                System.out.println("订购失败！！");
                break;
            }

        }while (true);
    }

    public OrderPizza(AbsFactory factory){
        this.setFactory(factory);








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
