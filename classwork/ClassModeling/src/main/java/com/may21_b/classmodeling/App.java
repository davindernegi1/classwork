/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.may21_b.classmodeling;
import java.util.Scanner;
/**
 *
 * @author Davinder
 * \practicing modeling and new classes
 */
public class App {
    public static void main(String[] args) {
        int i =0;
        Scanner sc = new Scanner(System.in);
        SimpleCalculator scMath = new SimpleCalculator();
    do{
        System.out.println("Let's do some math. ");
    
        
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for division");
            System.out.println("Press 9 for exit");
            
            int userInput = Integer.parseInt(sc.nextLine());
   // checking if entered the correct input or not         
       if (userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4 || userInput == 9)         
   {
       // addition
       if (userInput == 1)
       {
           
           int [] userInputMath= Display();
           
           System.out.println(scMath.Addition(userInputMath[0], userInputMath[1]));
                  
       }
       //Subtraction
       if (userInput == 2)
       {
           
           int [] userInputMath= Display();
           
           System.out.println(scMath.Subtraction(userInputMath[0], userInputMath[1]));
                  
       }
       //multiplication
       if (userInput == 3)
       {
           
           int [] userInputMath= Display();
           
           System.out.println(scMath.Multiplication(userInputMath[0], userInputMath[1]));
                  
       }
       //division
       if (userInput == 4)
       {
           
           int [] userInputMath= Display();
           
           System.out.println(scMath.Division(userInputMath[0], userInputMath[1]));
                  
       }
       
       if (userInput == 9)
       {
           System.out.println("Thank you !");
           break;
           //int userInputMath= Display();
           
       //scMath.Addition(), userInput)
       }
   
   }
   else
   {
       System.out.println("Wrong input ! Please enter the correct choice");
   }        
   }while (i !=9);
   
    }
    
    public static int[] Display ()
    {
        Scanner sc = new Scanner(System.in);
        int [] userInputDisplay = new int [2]; 
        System.out.println("Please Enter the First number");
        userInputDisplay[0] = Integer.parseInt(sc.nextLine());
        System.out.println("Please Enter the Second number");
        userInputDisplay[1] = Integer.parseInt(sc.nextLine());
        return userInputDisplay;
        
    }
            
    
}

