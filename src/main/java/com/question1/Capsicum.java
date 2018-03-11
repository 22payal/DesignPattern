package com.question1;

class Capsicum extends ToppingDecorator{

    Capsicum(Pizza piz){
        super(piz);
    }


    @Override
    public String getDescription() {
        return tempPizza.getDescription() +" capsicum";
    }


    @Override
    public int getCost() {
        return tempPizza.getCost() + 20;
    }
}


