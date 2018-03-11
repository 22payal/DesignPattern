package com.question1;

class FarmHouse implements Pizza{
    @Override
    public int getCost() {
        return 300;
    }

    @Override
    public String getDescription() {
        return "farm house";
    }
}
