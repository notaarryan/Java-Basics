//this file contains basic syntax for do-while loop
//do-while loop executes the loop ones even if the condition in the while is false
//even though the same task can be done through while statement by writing the same line of code outside the loop once but do-while loop makes the loop more readable

import java.util.*;
public class DoWhile {

    static void doWhile() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Pizza: 18CAD");
            System.out.println("2.Burger: 10CAD");
            System.out.println("3.Coffee: 3CAD");
            System.out.println("4.Soft Drink: 3CAD");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
        } while (choice < 1 || choice > 4);
    }
    
    static void whileLoop () {
        //this code has repetition
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        System.out.println("1.Pizza: 18CAD");
        System.out.println("2.Burger: 10CAD");
        System.out.println("3.Coffee: 3CAD");
        System.out.println("4.Soft Drink: 3CAD");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();

        while (choice < 1 || choice > 4) {
            System.out.println("1.Pizza: 18CAD");
            System.out.println("2.Burger: 10CAD");
            System.out.println("3.Coffee: 3CAD");
            System.out.println("4.Soft Drink: 3CAD");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
        } ;
    }
}
