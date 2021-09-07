/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.may21_b.listexamples;

import java.util.Scanner;

/**
 *
 * @author davinder
 */
public class UserIOImpl implements UserIO {
    @Override
    public void print(String message)
    {
       System.out.println(message);    
    } 
    @Override
    public String readString(String prompt)
    {
       Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
       System.out.println(prompt);   
       return userInput;
    } 
    @Override
    public int readInt(String prompt)
    {
        System.out.println(prompt); 
    Scanner sc = new Scanner(System.in);
        int userInput = Integer.parseInt(sc.nextLine());
         
       return userInput;
    }
    @Override
    public int readInt(String prompt, int min, int max)
    {
        int userInput =0;
    do
    {
       System.out.println(prompt + min + " , " + max);
        Scanner sc = new Scanner(System.in);
       
       userInput = Integer.parseInt(sc.nextLine());
          
    }while(userInput<=min || userInput>=max);
    return userInput;
    }
    
}
