/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicprogramingassement;

/**
 *
 * @author Davinder
 * Created on 2021-06-22
 * Checking dog genetics
 */
import java.util.Random; // java utility to use Random and Scanner methods
import java.util.Scanner;
public class DogGenetics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Decalaration and initializion of the scanner method to take user input
        System.out.println("What is your dog's name? ");
        String dogName = sc.nextLine(); // dog name variable to store user input

        System.out.println("Well then, I have this highly reliable report on Sir" + dogName+ "'s prestigious background right here.");
        System.out.println();
        Random rGen = new Random(); // Decalaration and initializion of the Random method.
        int percentage = rGen.nextInt(100);  // to store the first random values
        int addition = percentage; // to do addition to get the desired range for Random method
        System.out.println("Sir "+dogName+" is:");
        System.out.println();
        System.out.println(percentage+"% St. Bernard");
    
        percentage = rGen.nextInt(100- addition);
        addition = addition + percentage; 
        
        System.out.println(percentage+"% Chihuahua");
        
        percentage = rGen.nextInt(100- addition);
        
        System.out.println(percentage+"% Dramatic RedNosed Asian Pug");
        addition = addition + percentage;
        
        percentage = rGen.nextInt(100- addition);
        addition = addition + percentage;       
        System.out.println(percentage+"% Common Cur");
        
        int lastPercentage = 100-addition ;  // variabl to calculate remainder percentage
        
        System.out.println(lastPercentage+"% King Doberman");
        System.out.println();
        System.out.println("Wow, that's QUITE the dog! ");
    }
}
