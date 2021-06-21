/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

/**
 *Created on 2021-06-16
 * Exercise for FOR LOOPS class 
 * @Author Davinder
 * 
 */
import java.util.Scanner;
public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        
        System.out.println("How many units of fizzing and buzzing do you need in your life? ");
        Scanner sc =new Scanner(System.in);
        int userInput = Integer.parseInt(sc.nextLine());
        
       // System.out.println(userInput);
        
        for (int i=0; i <= userInput; i++)
        {
            int multipleOfThree = i%3; 
            int multipleOfFive = i%5; 
            
            
           if(multipleOfThree == 0 && multipleOfFive ==0 && i != 0)
           {
               System.out.println("fizz buzz");
           }
           else if(multipleOfThree == 0 && i !=0)
                {
                    System.out.println("fizz");
                }
        else if(multipleOfFive == 0 && i !=0)
                {
                    System.out.println("buzz");
                }
        else{
            System.out.println(i);
        }
        }
    }}

