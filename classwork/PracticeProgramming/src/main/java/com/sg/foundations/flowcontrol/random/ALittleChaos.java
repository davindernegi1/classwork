/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

/**
 *Created on 2021-06-16
 * Exercise for Random class 
 * @Author Davinder
 * 
*/
import java.util.Random;
public class ALittleChaos {
    public static void main (String[] args)
    {
       
        Random randomizer= new Random();
        
        System.out.println("Random can make intergers " + randomizer.nextInt());
        System.out.println("Random can print double " + randomizer.nextDouble());
        System.out.println("Or Even boolean " + randomizer.nextBoolean());
   //testing something
        //System.out.println("For Testing " + randomizer.nextInt(50));
        
        int num = randomizer.nextInt(100);
        System.out.println("You can store a randomized result:" + num);
        System.out.println("And use it over and over again: " + num + "," + num);
              
        
    }
}
