package com.question1;

public abstract class ToppingDecorator implements Pizza {

    protected Pizza tempPizza;

    ToppingDecorator(Pizza piz){
        tempPizza=piz;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public int getCost() {
        return tempPizza.getCost();
    }
}
