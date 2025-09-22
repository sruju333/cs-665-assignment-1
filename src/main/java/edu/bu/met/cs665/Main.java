/**
 * Name: SRUJANA NIRANJANKUMAR
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/22/2025
 * File Name: Main.java
 * Description: This class represents a fully automatic beverage vending machine.
 * It displays a menu of available drinks, brews the selected beverage, allows the addition of condiments,
 * and shows the final price. The program continues to operate until the user chooses to exit. It applies
 * core object-oriented programming principles such as abstraction, inheritance, encapsulation, and
 * polymorphism using abstract classes and interfaces, without incorporating design patterns.
 */

package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */

  public static void main(String[] args) {

    displayCafeMenu();

    takeOrder();

    System.out.println("Thanks for coming ~ !");

  }

  /**
   * This method displays MENU with beverages
   * that are available for brewing...
   * The method doesn't return anything
   * @return void
   */
  public static void displayCafeMenu(){
    System.out.println("**** MENU Café ****");
    ArrayList<String> menu = new ArrayList<>(Arrays.asList("Espresso", "Americano", "Latte", "Macchiato",
            "Black Tea", "Green Tea", "Yellow Tea"));
    for(String item : menu){
      System.out.println(item);
    }
    System.out.println("**** WELCOME ****");
  }

  /**
   * This method handles taking orders for beverages available for brewing.
   * It calculates the base price of each beverage using its corresponding object,
   * adds the cost of condiments based on the number of units added, displays the
   * final price to the user, and continues to accept orders until the user chooses to exit.
   * @return void
   */
  public static void takeOrder(){
    Scanner scanner = new Scanner(System.in);
    while(true){
      System.out.println("What would you like to drink? Type exit to leave...");
      String beverage = scanner.nextLine();

      if(beverage.equals("exit")){
        break;
      }

      Beverage beverageObj = null;

      switch (beverage.toLowerCase()){
        case "espresso":
          beverageObj = new Espresso();
          break;
        case "americano":
          beverageObj = new Americano();
          break;
        case "latte":
          beverageObj = new Latte();
          break;
        case "macchiato":
          beverageObj = new Macchiato();
          break;
        case "black tea":
          beverageObj = new BlackTea();
          break;
        case "green tea":
          beverageObj = new GreenTea();
          break;
        case "yellow tea":
          beverageObj = new YellowTea();
          break;
        default:
          System.out.println("Invalid beverage");
          continue; // Just restart the loop
      }

      beverageObj.brew();

      System.out.println("Add milk or sugar? Enter 0-3 units");
      System.out.println("Milk units - ");
      Integer milk = scanner.nextInt();
      System.out.println("Sugar units - ");
      Integer sugar = scanner.nextInt();
      scanner.nextLine();

      beverageObj.addMilk(milk);
      beverageObj.addSugar(sugar);

      System.out.println("Here is your " + beverage.toUpperCase() +
              "\nYour total cost is: " + beverageObj.getBeveragePrice());
    }
  }


}
