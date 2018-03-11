package com.question1;

class Tomato extends ToppingDecorator{

    Tomato(Pizza piz){
        super(piz);
    }


    @Override
    public String getDescription() {
        return tempPizza.getDescription() +" tomato";
    }


    @Override
    public int getCost() {
        return tempPizza.getCost() + 10;
    }
}
