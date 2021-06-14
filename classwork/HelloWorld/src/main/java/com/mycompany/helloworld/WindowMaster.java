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
    String stringHeight;
    String stringWidth;

    // declare other variables
    float areaOfWindow;
    float cost;
    float perimeterOfWindow;
//take he input from user about height and weight
Scanner myScanner = new Scanner (System.in);
System.out.println("Please enter the Height of the window");
stringHeight = myScanner.nextLine();

System.out.println("Please enter the Width of the window");
stringWidth = myScanner.nextLine();

height=Float.parseFloat(stringHeight);
width= Float.parseFloat(stringWidth);

 // calculate the area of the window
    areaOfWindow = height * width;

    // calculate the perimeter of the window
    perimeterOfWindow = 2 * (height + width);
     // calculate the total cost - use a hard-coded value
    // for material cost
    cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
    // display the results to the user
    System.out.println("Window height = " + stringHeight);
    System.out.println("Window width = " + stringWidth);
    System.out.println("Window area = " + areaOfWindow);
    System.out.println("Window perimeter = " + perimeterOfWindow);
    System.out.println("Total Cost =  " + cost);
   
    }
}
