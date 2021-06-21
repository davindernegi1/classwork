/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.helloworld;

/**
 *Created on 2021-jun-10
 * @author davinder
 * Need to calculate the cost for windows
 */
import java.util.Scanner;
public class WindowMaster {
    public static void main(String[] args)
    {
// declare variables for height and width
    float height;
    float width;

    // declare String variables to hold the user's height and
    // width input
    // declare other variables
    float areaOfWindow;
    float cost;
    float perimeterOfWindow;
//take he input from user about height and weight

height = addValue("Please enter the Height of the window:");
width = addValue("Please enter the Width of the window:");


 // calculate the area of the window
    areaOfWindow = height * width;

    // calculate the perimeter of the window
    perimeterOfWindow = 2 * (height + width);
     // calculate the total cost - use a hard-coded value
    // for material cost
    cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
    // display the results to the user
    System.out.println("Window height = " + height);
    System.out.println("Window width = " + width);
    System.out.println("Window area = " + areaOfWindow);
    System.out.println("Window perimeter = " + perimeterOfWindow);
    System.out.println("Total Cost =  " + cost);
   
    }
    public static float addValue (String prompt)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        String input = sc.nextLine();
        float floatVal = Float.parseFloat(input);
    return floatVal;
    }
}
