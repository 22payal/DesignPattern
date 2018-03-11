package com.question4;

public class StreetFighter {

    public static void main(String[] args) {

        Character character1=new Character();
        character1.setLevelno(new LevelSecond());
        character1.jump();
        character1.kick();
        character1.roll();
        character1.punch();

        Character character2 = new Character();
        character2.setLevelno(new LevelFirst());
        character2.roll();

    }
}