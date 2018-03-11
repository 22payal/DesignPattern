package com.question1;


class Margherita implements Pizza{
    @Override
    public int getCost() {
        return 400;
    }

    @Override
    public String getDescription() {
        return "margherita";
    }
}