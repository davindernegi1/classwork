/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;

/**
 * @author Davinder
 * Created on 2021-06-15
 * Exercise from debugging 
 */
import java.util.Scanner;
public class MiniMadLibs {
    public static void main(String[] args) {
        // Declaring variables to use further
        String noun;
        String adjective;
        String noun2;
        int number;
        String numberString;
        String adjective2;
        String pluralNoun1;
        String pluralNoun2;
        String pluralNoun3;
        String verbPresentTense;
        String verbPastTense;
        
        // Intializing the scanner class to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Let Play MAD LIBS !");
        System.out.println("I need a noun:");
        // Taking the input from user and storing it to use further.
        noun = sc.nextLine();
        
        System.out.println("Now an adjective:");
        adjective = sc.nextLine();
        
        System.out.println("Another noun:");
        noun2 = sc.nextLine();
        
        System.out.println("And a number:");
        numberString = sc.nextLine();
        
        /* As the input taken from user is in form of string so storing it to a variable and then 
        converting it interger.*/ 
        number = Integer.parseInt(numberString);
        
       
        
        System.out.println("Another Adjective:");
        adjective2 = sc.nextLine();
        
        System.out.println("A plural noun:");
        pluralNoun1 = sc.nextLine();
        System.out.println("Another one:");
        pluralNoun2 = sc.nextLine();
        System.out.println("One more:");
        pluralNoun3 = sc.nextLine();


        System.out.println("A verb (infinitive form):");
        verbPresentTense = sc.nextLine();
        
        System.out.println("Same verb (past participle):");
        verbPastTense = sc.nextLine();

// Displaying the content entered by the user.
        System.out.println("*** NOW LETS GET MAD (libs) ***");
        System.out.println(noun+": the "+adjective + " frontier. These are the voyages of the starship " + noun2 + ".");
        System.out.print("Its"+" "+number+" "+"-year mission: to explore strange"+" "+adjective2+" "+pluralNoun1+",");
        System.out.print("to seek out"+" "+adjective2+" "+pluralNoun2+" and "+" "+adjective2+" "+pluralNoun3+", to boldly"+" "+verbPresentTense+" "+" where no one has "+verbPastTense+" before.");        
        
    }
    
}
