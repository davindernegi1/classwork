/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

/**
  *Created on 2021-06-16
 * Exercise for While loops 
 * @Author Davinder
*/
import java.util.Random;
public class LazyTeenager {
    public static void main(String[] args) {
     
        Random rGen = new Random();
        int randomizer = rGen.nextInt(100);
        int increment = randomizer + 100;
     while (randomizer < increment)
     {
                  System.out.println("Clean your room!! (x1)");
                  randomizer = randomizer + 10;
               if (randomizer <increment)
                       {
                           System.out.println("Clean your room!! (x2)");
                           randomizer = randomizer + 10;
               }
               if (randomizer <increment)
                       {
                           System.out.println("Clean your room!! (x3)");
                           randomizer = randomizer + 10;
               }
   if (randomizer <increment)
                       {
                           System.out.println("Clean your room!! (x4)");
                           randomizer = randomizer + 10;
               }
   if (randomizer <increment)
                       {
                           System.out.println("Clean your room!! (x5)");
                           randomizer = randomizer + 10;
               }
   if (randomizer <increment)
                       {
                           System.out.println("Clean your room!! (x6)");
                           randomizer = randomizer + 10;
               }
    if (randomizer <increment)
                       {
                           System.out.println("Clean your room!! (x7)");
                           randomizer = randomizer + 10;
               }
  
     if (randomizer <increment)
                       {
                           System.out.println("Clean your room!! (x8)");
                           randomizer = randomizer + 10;
               }
  
      if (randomizer <increment)
                       {
                           System.out.println("Clean your room!! (x9)");
                           randomizer = randomizer + 10;
               }
  
     }
        System.out.println("That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
    }
   
}
