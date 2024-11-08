package com.syntexpro.homework;

import java.util.Scanner;

public class CoffeeOrder {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        double regularPrice;
//        double discountedPrice;
//        double item;
//        double tax;
//        double totalAmount;
//        double Tax = -.07;
//        double totalPrice, regularPrice, discountedPrice, item, tax;
//        double salesTax = .07;
////         String [] size = {"Small", "Medium", "Large"};
//        double[] prices = {3.00, 4.00, 5.00};
//        double subtotal = 0.0;
        // int coffeeChoice = scanner.nextInt();
//
        //coffee details
        System.out.println("what kind of coffee would you like");
       String coffeeType = sc.nextLine().toLowerCase();
        System.out.println("what size would you like");
        String sizeType = sc.nextLine();
        System.out.println("how many cups would you like to order");
       int quantity = sc.nextInt();
        double price = 0.0;
        switch (coffeeType) {
            case "Espresso":
                if (sizeType.equals("small")) price = 3.00;
                else if (sizeType.equals("medium")) price = 4.00;
                else if (sizeType.equals("large")) price = 5.00;
                break;
            case "Latte":
                if (sizeType.equals("small")) price = 4.00;
                else if (sizeType.equals("medium")) price = 5.00;
                else if (sizeType.equals("large")) price = 6.00;
                break;
            case "Cappuccino":
                if (sizeType.equals("small")) price = 4.50;
                else if (sizeType.equals("medium")) price = 5.50;
                else if (sizeType.equals("large")) price = 6.50;
                break;
            default:
                System.out.println("invalid coffe type");
                return;
        }


//        double subtoal = price * quantity;
//        System.out.println(subtoal);
//
//        if (price ==0){
//            System.out.println("invalid");
//        }




        }

;

    }



