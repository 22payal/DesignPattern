package com.question4;

class LevelFirst implements StrategyLevels {
    @Override
    public void roll() {
        System.out.println("roll at level1");
    }

    @Override
    public void jump() {
        System.out.println("jump at level1");
    }
}
