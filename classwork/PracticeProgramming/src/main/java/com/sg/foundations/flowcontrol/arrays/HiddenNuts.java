/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author davinder
 * created on 2021-06-21
 * arrays last excercise
 */
import java.util.Random;
public class HiddenNuts {
    public static void main(String[] args) {
           String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");

        // Nut finding code should go here! 
 for (int i=0; i<hidingSpots.length; i++)
 {
if (hidingSpots[i] == "Nut") 
{
         System.out.println("Found it! It's in spot# " + i);
         break;
}
System.out.println("Number of time looped " + i);
 }
        
    }
}
