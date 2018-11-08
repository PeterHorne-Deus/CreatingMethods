/*
 * Peter Horne-Deus
 * This is a project that allows the user to choose between 5 math equations and uses them with methods
 * CreatingMethods.java
 * November 7,2018
 */

package creatingmethods;

import java.util.Scanner;
import java.util.Random;

public class CreatingMethods {
    
    public static void main(String[] args) {
        //Creating Scanner
        Scanner keyedInput = new Scanner(System.in);
        
        //Variables
        int menu,play;
        int num1,num2,num3,num4;
        
        //Sets the play variable to start
        play = 1;
        //Runs program over and over again until given an exit que
        while (play == 1){
            //Main menu items
            System.out.println("Enter a number to choose what you would like to do: ");
            System.out.println("1... Powers");
            System.out.println("2... Averages");
            System.out.println("3... Pythagorean Theorem");
            System.out.println("4... Square Root");
            System.out.println("5... Random Number Generation");
            System.out.println("6... Exit");
            
            //Setting the value the user enterd
            menu = keyedInput.nextInt();

            //Setting up which math item the user wants to do
            if (menu == 1){
                System.out.println("You will be prompted to enter two numbers. "
                        + "The first is the number and the second is the power \n");
                System.out.println("Enter the first number.");
                num1 = keyedInput.nextInt();
                System.out.println("Enter the second number (The Power).");
                num2 = keyedInput.nextInt();
                
                power(num1,num2);
            }
            else if (menu == 2){
                System.out.println("You will be prompted for four numbers and the "
                        + "program will find the average of the numbers.");
                
                System.out.println("Enter the first number");
                num1 = keyedInput.nextInt();
                System.out.println("Enter the second number");
                num2 = keyedInput.nextInt();
                System.out.println("Enter the third number");
                num3 = keyedInput.nextInt();
                System.out.println("Enter the fourth number");
                num4 = keyedInput.nextInt();
                
                average(num1,num2,num3,num4);
            }
            else if (menu == 3){
                System.out.println("You will be prompted to imput two side lengths in cm."
                        + "remeber it has to be a right side triangle");
                System.out.println("Enter the first side length in cm");
                num1 = keyedInput.nextInt();
                System.out.println("Enter the second side length in cm");
                num2 = keyedInput.nextInt();
                
                theorem(num1,num2);
            }
            else if (menu == 4){
                System.out.println("Enter one number that you would like the square root of. \n"
                + "Note the number must be above 0");
                num1 = keyedInput.nextInt();
                
                while (menu == 4){
                    if (num1 > 0){
                        menu = 10;
                        sqrt(num1);
                    
                    }
                    else{
                        System.out.println("Enter a number above 0");
                        num1 = keyedInput.nextInt();
                    }
                }
            }
            else if (menu == 5){
                rng();
            }
            else if (menu == 6){
                play = 0;
            }
            else{
                System.out.println("Enter a useable value");
            }
        }
    }
    
    public static void rng() {
        int total = 0;
        
        total = (int)Math.round(Math.random()*11+1);
        
        System.out.println("Your ranom number is " + total);
    }
    
    public static void sqrt(int n1) {
        double total;
        
        
        total = Math.sqrt(n1);
        Math.round(total);
        
        System.out.println("The total is: " + Math.round(total));
    }
    public static void theorem(int n1,int n2) {
        double total = 0;
                
        n1 = n1*n1;
        n2 = n2*n2;
        
        total = n1 + n2;
        total = Math.sqrt(total);
        
        System.out.println("The total of the third side is: " + Math.round(total) + "cm");
        
    }
    
    public static void power(int n1,int n2) {
        double total = 0;
        
        total = Math.pow(n1,n2);
        System.out.println(total);
    }
    
    public static void average(int n1,int n2,int n3,int n4) {
        double total;
        
        total = n1 + n2 + n3 + n4;
        
        total = total / 4;
        
        System.out.println("The average is: " + Math.round(total));
    }
    
}
