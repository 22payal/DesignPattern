package com.question1;

class Jalapeno extends ToppingDecorator{

    Jalapeno(Pizza piz){
        super(piz);
    }


    @Override
    public String getDescription() {
        return tempPizza.getDescription() +" jalapano";
    }


    @Override
    public int getCost() {
        return tempPizza.getCost() + 40;
    }
}