package com.question1;

class PeppyPaneer implements Pizza{

    public int getCost(){
        return 50;
    }

    @Override
    public String getDescription() {
        return "peppy paneer";
    }
}