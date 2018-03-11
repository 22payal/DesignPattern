package com.question1;

class Paneer extends ToppingDecorator{

    Paneer(Pizza piz){
        super(piz);
    }


    @Override
    public String getDescription() {
        return tempPizza.getDescription() +" paneer";
    }


    @Override
    public int getCost() {
        return tempPizza.getCost() + 50;
    }
}