/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.methods;

import java.util.Random;

/**
 *
 * @author mamta
 */
public class RANDOMRANGETEST {
    public static void main (String[] args)
    {
         Random rGen = new Random ();
         int min = 50; 
         int max = 100;
         int randomNum = rGen.nextInt(max-min+1) + min;
         System.out.println(randomNum);
     }
    
}
