package com.syntexpro.homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CoffeOrder1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Welcome to my coffee Shop");
        System.out.println("Please select your coffee type: Espresso, Latte, Cappuccino");
        String coffeeType = sc.nextLine().toLowerCase();
        System.out.println("Please select your coffee size: Small, Medium, or Large");
        String coffeeSize = sc.nextLine().toLowerCase();
        System.out.println("How many cups would you like to order?");
        int quantity = sc.nextInt();
        double price = 0.0;
        switch (coffeeType) {
            case "Espresso":
                if (coffeeSize.equals("small")) price = 3.00;
                else if (coffeeSize.equals("medium")) price = 4.00;
                else if (coffeeSize.equals("large")) price = 5.00;
                break;
            case "Latte":
                if (coffeeSize.equals("small")) price = 4.00;
                else if (coffeeSize.equals("medium")) price = 5.00;
                else if (coffeeSize.equals("large")) price = 6.00;
                break;
            case "Cappuccino":
                if (coffeeSize.equals("small")) price = 4.50;
                else if (coffeeSize.equals("medium")) price = 5.50;
                else if (coffeeSize.equals("large")) price = 6.50;
                break;
            default:
                System.out.println("invalid coffe type");
                return;


        }
    }
}
