/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

/**
 * Created on 2021-06-16
 * Exercise for Random class 
 * @Author Davinder
 * 
 */
import java.util.Random;
import java.util.Scanner;
public class GuessMeMore {
    public static void main(String[] args) {
        int min = -100;
        int max = 100;
        
        Random rGen= new Random();
        
        int randomizer= (int)(rGen.nextDouble() * (max-min)+ min);
        
        Scanner sc = new Scanner(System.in);
        int i=0;
        do
        {
        System.out.println(" I've chosen a number between " + min + " and " + max + ". Bet you can't guess it!");
        String userNumberString= sc.nextLine();
        int userNumber= Integer.parseInt(userNumberString);    
        if (userNumber == randomizer)
        {
            System.out.println("Wow, nice guess! That was it!");
        }else if (randomizer > userNumber)
                {
                    System.out.println("Ha, nice try - too low! Try again!");
                }else if (randomizer < userNumber)
                {
                    System.out.println("Ha, nice try - too High! Try again!");
                }
               
        i++;
        }while (i==1);
         System.out.println("try next time");
}}