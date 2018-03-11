package com.question1;

import java.util.Scanner;

public class PizzaMaker {
    public static void main(String[] args) {

        System.out.println("Enter what kind of pizza you want");
        System.out.println("1.Farm House 2.Chicken Fiesta 3. Margherita 4.Peppy Paneer");

        System.out.println("................................");


        System.out.println("Enter the additional toppings : ");
        System.out.println("1.Tomato 2.Capsicum 3.Paneer 4.Barbeque 5.Jalapeno");

        System.out.println("................................");

        Pizza myPizza=new Barbeque(new Capsicum(new Margherita()));

        System.out.println("The ingerdients are :");

        System.out.println(myPizza.getDescription());

        System.out.println("FINAL COST IS :");

        System.out.println(myPizza.getCost());


    }
}