package com.question4;


class LevelSecond implements StrategyLevels {
    @Override
    public void roll() {
        System.out.println("roll at level2");
    }

    @Override
    public void jump() {
        System.out.println("jump at level2");
    }
}