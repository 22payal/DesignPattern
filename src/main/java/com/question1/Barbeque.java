package com.question1;

class Barbeque extends ToppingDecorator{

    Barbeque(Pizza piz){
        super(piz);
    }


    @Override
    public String getDescription() {
        return tempPizza.getDescription() +" barbeque";
    }


    @Override
    public int getCost() {
        return tempPizza.getCost() + 100;
    }
}