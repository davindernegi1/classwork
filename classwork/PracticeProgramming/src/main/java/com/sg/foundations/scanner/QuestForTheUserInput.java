/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;

/**
 *  @author Davinder
 * Created on 2021-06-14
 * Exercise from debugging 
 */
import java.util.Scanner;
public class QuestForTheUserInput {
    public static void main (String[] args)
    {
        Scanner inputReader = new Scanner(System.in);
      String yourName;
      String yourQuest;
      double velocityOfSwallow;
       // We can use the Scanner's readLine to assign value to our strings
        // because its return type is string
        System.out.println("What is your name?? ");
        yourName = inputReader.nextLine();

        System.out.println("What is your quest?! ");
        yourQuest = inputReader.nextLine();

        // When we get to our double data type, we can use Scanner's nextDouble method
        // or we can use the Double.parseDouble to convert the nextLine's String

        System.out.println("What is the airspeed velocity of an unladen swallow?!?! ");
        velocityOfSwallow = Double.parseDouble(inputReader.nextLine());
        System.out.println("How do you know " + velocityOfSwallow + " is correct, " + yourName + "?");
        System.out.println("You didn't even know if the swallow was African or European!");
        System.out.println("Maybe skip answering things about birds and instead go " + yourQuest + ".");
        System.out.print("What is your name?? TEST");
    }
      
    }