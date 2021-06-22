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
 * Healthy Hearts
 */
import java.util.Scanner; // java utility to use Scanner methods
public class HealthyHearts {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // // Decalaration and initializion of the scanner method to take user input
        System.out.println("What is your age? ");
        int userInput = Integer.parseInt(sc.nextLine());
        
        int maximumHeartRate = 220 -userInput; 
        int lowerRange= maximumHeartRate/2;
        int upperRange= (maximumHeartRate*85/100);
        
        System.out.println("Your maximum heart rate should be " + maximumHeartRate +" beats per minute");        
    System.out.println("Your target HR Zone is "+lowerRange+ " - " +upperRange +" beats per minute");        
    
    }
}