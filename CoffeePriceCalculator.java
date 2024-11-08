package com.syntexpro.homework;


    import java.util.Scanner;

    public class CoffeePriceCalculator {
        public static void main(String[] args) {
            // Create a scanner object to get user input
            Scanner scanner = new Scanner(System.in);

            // Display the menu
            System.out.println("Welcome to the Coffee Shop!");
            System.out.println("Please choose a type of coffee:");
            System.out.println("1. Espresso");
            System.out.println("2. Cappuccino");
            System.out.println("3. Latte");
            System.out.println("4. Americano");
            System.out.println("5. Mocha");

            // Get the user's choice
            System.out.print("Enter the number corresponding to your choice: ");
            int coffeeChoice = scanner.nextInt();

            // Declare a variable for the price
            double price = 0.0;

            // Use a switch statement to determine the price based on the user's choice
            switch (coffeeChoice) {
                case 1:
                    price = 2.50; // Price for Espresso
                    break;
                case 2:
                    price = 3.50; // Price for Cappuccino
                    break;
                case 3:
                    price = 4.00; // Price for Latte
                    break;
                case 4:
                    price = 2.75; // Price for Americano
                    break;
                case 5:
                    price = 4.25; // Price for Mocha
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid coffee type.");
                    return; // Exit the program if the choice is invalid
            }

            // Display the price of the selected coffee
            System.out.printf("The price of your selected coffee is: $%.2f\n", price);

            // Close the scanner
            scanner.close();
        }
    }


