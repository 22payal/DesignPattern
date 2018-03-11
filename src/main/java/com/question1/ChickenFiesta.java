package com.question1;

class ChickenFiesta implements Pizza{

    public int getCost(){
        return 600;
    }

    @Override
    public String getDescription() {
        return "chicken fiesta";
    }
}