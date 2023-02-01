package com.wang.factory.simplefactory.pizzastore.staticImprove.pizza;

public abstract class Pizza {
    protected String name;
    public abstract void prepare();
    public void bake(){
        System.out.println(name+" baking ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void cut(){
        System.out.println(name+" cuting ");
    }
    public void box(){
        System.out.println(name+" boxing ");
    }
}
